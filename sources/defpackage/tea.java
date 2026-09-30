package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class tea {
    public static final ft a;
    public static final jy4 b;
    public static final qfc c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            a = null;
            b = new jy4(22);
            c = new qfc();
        } else if (property.equals("Dalvik")) {
            a = new ft();
            b = new iob(0);
            c = new c51();
        } else {
            a = null;
            b = new iob(1);
            c = new c51();
        }
    }
}
