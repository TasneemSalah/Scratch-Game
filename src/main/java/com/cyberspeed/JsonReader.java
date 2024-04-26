package com.cyberspeed;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.cyberspeed.JSONPojo.Input;
import com.cyberspeed.JSONPojo.Output;
import com.cyberspeed.JSONPojo.Root;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.codemodel.JCodeModel;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;


public class JsonReader {


    public Root readJson(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        Root root = mapper.readValue(file, Root.class);
        return root;
    }

    public Input readJsonInput() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        Input input = mapper.readValue(new File("src/main/resources/input.json"), Input.class);
        return input;
    }

    public void writeJsonOutput(Output output) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        /** Switch path when running from IDE **/
        // src/main/resources/
        mapper.writeValue(new File("result.json"), output);
    }

    public void convertJsonToJavaClass(URL inputJsonUrl, File outputJavaClassDirectory, String packageName, String javaClassName)
            throws IOException {
        JCodeModel jcodeModel = new JCodeModel();

        GenerationConfig config = new DefaultGenerationConfig() {
            @Override
            public boolean isGenerateBuilders() {
                return true;
            }

            @Override
            public SourceType getSourceType() {
                return SourceType.JSON;
            }
        };

        SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
        mapper.generate(jcodeModel, javaClassName, packageName, inputJsonUrl);

        jcodeModel.build(outputJavaClassDirectory);
    }


}
