package ru.j4j.poly;

public class Service {
    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void add() {
        store.save("Dmitrii");
    }

    public static void main(String[] args) {
        FileStore store = new FileStore();
        Service service = new Service(store);
        service.add();

        MemStore memStore = new MemStore();
        Service serviceMemStore = new Service(store);
        serviceMemStore.add();
    }
}
