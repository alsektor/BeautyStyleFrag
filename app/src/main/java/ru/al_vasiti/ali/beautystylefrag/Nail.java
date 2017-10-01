package ru.al_vasiti.ali.beautystylefrag;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ru.al_vasiti.ali.beautystyle.R;

/**
 * Created by РС on 07.09.2017.
 */

public class Nail {

    private String name;
    private String description;
    private int imageResourceld;
    public String test;

    public List<Nail> nails = new ArrayList<>();

    public List<Nail> getNails() {
        return nails;
    }
    public String getTest(){
        return test;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceld() {
        return imageResourceld;
    }

    public Nail() {
        InitList();
    }

    public Nail(String name, String description, int imageResourceld) {
        this.name = name;
        this.description = description;
        this.imageResourceld = imageResourceld;
    }

    private void InitList() {
        for (int i = 0; i < 4; i++) {
            Nail nail0 = new Nail("Классический маникюр", "Классический обрезной маникюр подходит для любого" +
                    "состояния ногтей.Процедура начинается с обязательной обработки кожи рук специальным" +
                    "дезинфицирующим средством.Ногтям придаётся желаемая форма. Руки погружают в тёплый" +
                    "раствор,после чего размягчённую кутикулу удаляют маникюрными щипчиками, избавляются от" +
                    "заусенцев.В конце процедуры массажными движениями на кожу вокруг ногтя наносится питательное" +
                    "масло-оно оказывает заживляющее воздействие,питает ногтевую пластину.", R.drawable.kl_man);
            Nail nail1 = new Nail("Аппаратный маникюр", "Отличное решение для проблемных ногтей.Аппаратный " +
                    "маникюр будет эффективен как при поврежденной ногтевой пластине, так и при различных грибковых" +
                    "инфекциях. Аппаратный маникюр выполняется с использованием специального аппарата:боры и" +
                    "фрезы устраняют ороговевшие участки эпидермиса вокруг ногтевого ложа, придают форму ногтям" +
                    "оставляя кутикулу без повреждений. Маникюр обязательно делают только на сухой коже,что" +
                    "полностью исключает травматизм и риск заражения. Процедура абсолютно безопасна и" +
                    "безболезненна.", R.drawable.ap_man);
            Nail nail2 = new Nail("Аппаратный педикюр","Благодаря особой технике проведения аппаратного" +
                    "педикюра-решение проблем стопы,вросшего ногтя,трещин,мозолей,грибковых заболеваний-" +
                    "становится реальным. Аппаратный педикюр абсолютно гигиеничен. Стопа не подвергается" +
                    "распариванию в воде, а обрабатывается специальным смягчающим средством для ороговевшей" +
                    "кожи. В качестве инструментов для обработки ногтей,кутикулы и загрубевшей кожи- используют" +
                    "профессиональные насадки,боры и фрезы различных размеров и диаметров. Они удаляют жесткий" +
                    "роговой слой,не трогая здоровую кожу, что делает процедуру полностью безболезненной.", R.drawable.ap_ped);

            nails.add(nail0);
            nails.add(nail1);
            nails.add(nail2);
        }
    }
}