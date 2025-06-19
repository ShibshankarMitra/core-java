package design_patterns.factory;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public abstract class Computer {
    private String ram;
    private String cpu;
    private String storage;

    public abstract void display();
}
