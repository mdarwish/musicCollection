package com.validus.musicCollection.api;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation;
import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders;
import org.springframework.restdocs.mockmvc.RestDocumentationResultHandler;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.restdocs.operation.preprocess.OperationPreprocessor;
import org.springframework.restdocs.operation.preprocess.OperationRequestPreprocessor;
import org.springframework.restdocs.operation.preprocess.Preprocessors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class musicControllerRestDocTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

	@Rule
    public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation("target/generated-snippets");


    @Before
    public void setUp() {
    	this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context)
    			.apply(documentationConfiguration(this.restDocumentation)
    					.uris()
    					.withScheme("http")
    					.withHost("localhost")
    					.withPort(9700))
    			.build();
    }
    
    @Test
    public void get() throws Exception {
    	mockMvc.perform(RestDocumentationRequestBuilders.get("/collection")
                .accept(MediaType.APPLICATION_JSON))
		        .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andDo(MockMvcRestDocumentation.document("collection"));
    }    

    @Test
    public void getAllSongs() throws Exception {
    	mockMvc.perform(RestDocumentationRequestBuilders.get("/collection/songs")
                .accept(MediaType.APPLICATION_JSON))
		        .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andDo(MockMvcRestDocumentation.document("getAllSongs"));
    }    

    @Test
    public void getSongById() throws Exception {
    	mockMvc.perform(RestDocumentationRequestBuilders.get("/collection/song/1")
                .accept(MediaType.APPLICATION_JSON))
		        .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andDo(MockMvcRestDocumentation.document("getSongById"));
    }    
    
    @Test
    public void getAllAlbums() throws Exception {
    	mockMvc.perform(RestDocumentationRequestBuilders.get("/collection/albums")
                .accept(MediaType.APPLICATION_JSON))
		        .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andDo(MockMvcRestDocumentation.document("getAllAlbums"));
    }    
    
    @Test
    public void getAlbumById() throws Exception {
    	mockMvc.perform(RestDocumentationRequestBuilders.get("/collection/album/1")
                .accept(MediaType.APPLICATION_JSON))
		        .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andDo(MockMvcRestDocumentation.document("getAlbumById"));
    }    
    
    @Test
    public void getAllArtists() throws Exception {
    	mockMvc.perform(RestDocumentationRequestBuilders.get("/collection/artists")
                .accept(MediaType.APPLICATION_JSON))
		        .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andDo(MockMvcRestDocumentation.document("getAllArtists"));
    }    
    
    @Test
    public void getArtistById() throws Exception {
    	mockMvc.perform(RestDocumentationRequestBuilders.get("/collection/artist/1")
                .accept(MediaType.APPLICATION_JSON))
		        .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andDo(MockMvcRestDocumentation.document("getArtistById"));
    }    
    
}

