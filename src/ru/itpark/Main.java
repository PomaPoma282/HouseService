package ru.itpark;

import ru.itpark.comparator.DistrictComparator;
import ru.itpark.comparator.PriceComparator;
import ru.itpark.domain.House;
import ru.itpark.repository.HouseRepository;
import ru.itpark.service.HouseService;

import javax.sound.midi.Soundbank;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseService service = new HouseService(new HouseRepository());

        service.add(new House(1, "1к", "Вахитовский", 2_000));
        service.add(new House(2, "2к", "Приволжский", 1_800));
        service.add(new House(3, "1к", "Вахитовский", 1_800));
        service.add(new House(4, "2к", "Вахитовский", 2_500));
        service.add(new House(5, "2к", "Приволжский", 2_500));
        service.add(new House(6, "1к", "Приволжский", 1_500));
        service.add(new House(7, "3к", "Вахитовский", 4_000));


        List<House> all = service.findAllByName("вахит");
        System.out.println(all);

        all = service.findAllByPrice(2_500, 4_000);
        System.out.println(all);





    }
}
