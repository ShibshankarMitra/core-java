package design_patterns.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class Computer {
    private final String display;
    private final String keyboard;
    private final String graphicsCard;
    private final String cooler;

    private Computer(ComputerBuilder builder) {
        this.display = builder.display;
        this.keyboard = builder.keyboard;
        this.graphicsCard = builder.graphicsCard;
        this.cooler = builder.cooler;
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }

    @Getter
    @Setter
    public static class ComputerBuilder {
        private String display;
        private String keyboard;
        private String graphicsCard;
        private String cooler;

        public ComputerBuilder display(String display) {
            this.display = display;
            return this;
        }

        public ComputerBuilder keyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public ComputerBuilder graphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder cooler(String cooler) {
            this.cooler = cooler;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
