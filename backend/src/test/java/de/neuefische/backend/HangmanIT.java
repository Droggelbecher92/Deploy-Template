package de.neuefische.backend;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class HangmanIT {
    //Lösungswort: HALLOWELT

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnText() throws Exception {
        mockMvc.perform(get("/api/hangmen"))
                .andExpect(content().string("_________"));

    }

    @Test
    @DirtiesContext
    void shouldFindLetterAInSolution() throws Exception {
        mockMvc.perform(post("/api/hangmen/a"))
                .andExpect(content().string("_A_______"));
    }

    @Test
    @DirtiesContext
    void shouldFindLetterAAndLInSolution() throws Exception {
        mockMvc.perform(post("/api/hangmen/a"));
        mockMvc.perform(post("/api/hangmen/l"))
                .andExpect(content().string("_ALL___L_"));
    }


}
