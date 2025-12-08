public class Items {
    private String name;
    private String identifier;

    public Items(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Items)) {
            return false;
        }

        Items other = (Items) obj;

        if (this.getIdentifier().equals(other.getIdentifier())) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return getIdentifier() + ": " + getName();
    }

}
