package com.tw.apistackbase.repository;

import com.tw.apistackbase.entity.Inquisitor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.web.JsonPath;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ExtendWith(SpringExtension.class)
class InquisitorRepositoryTest {

    @Autowired
    private InquisitorRepository inquisitorRepository;

    @Test
    void should_save_and_find_inquisitor() {
        Inquisitor inquisitor = new Inquisitor();
        inquisitor.setInquistorName("LiMing");

        inquisitorRepository.save(inquisitor);
        Inquisitor correspondInquisitor = inquisitorRepository.getOne(inquisitor.getId());

        assertThat(correspondInquisitor.getInquistorName()).isEqualTo("LiMing");
    }

    @Test
    void should_delete_inquisitor(){
        Inquisitor inquisitor = new Inquisitor();
        inquisitor.setInquistorName("LiMing");

        inquisitorRepository.save(inquisitor);
        inquisitorRepository.delete(inquisitor);

        assertThat(inquisitorRepository.findAll().size()).isEqualTo(0);
    }

    @Test
    void should_find_by_id() {
        Inquisitor inquisitor = new Inquisitor();
        inquisitor.setInquistorName("LiMing");

        inquisitorRepository.save(inquisitor);
        Inquisitor resultInquisitor = inquisitorRepository.findById(inquisitor.getId()).get();

        assertThat(resultInquisitor.getInquistorName()).isEqualTo("LiMing");
    }

    @Test
    void should_update_inquisitor(){
        Inquisitor inquisitor = new Inquisitor();
        inquisitor.setInquistorName("LiMing");

        inquisitorRepository.save(inquisitor);
        inquisitor.setInquistorName("LiMing2");
        inquisitorRepository.save(inquisitor);

        assertEquals(inquisitorRepository.findById(inquisitor.getId()).get().getInquistorName(),"LiMing2");
    }
}