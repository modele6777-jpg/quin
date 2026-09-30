package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rce {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

    static {
        Object dzbVar;
        Object dzbVar2;
        Object dzbVar3;
        try {
            dzbVar = System.getProperty("kotlin.reflect.jvm.useK1Implementation");
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        String str = (String) dzbVar;
        boolean z = false;
        a = str != null && Boolean.parseBoolean(str);
        try {
            dzbVar2 = System.getProperty("kotlin.reflect.jvm.newFakeOverridesImplementation");
        } catch (Throwable th2) {
            dzbVar2 = new dzb(th2);
        }
        if (dzbVar2 instanceof dzb) {
            dzbVar2 = null;
        }
        String str2 = (String) dzbVar2;
        b = str2 != null && Boolean.parseBoolean(str2);
        try {
            dzbVar3 = System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly");
        } catch (Throwable th3) {
            dzbVar3 = new dzb(th3);
        }
        String str3 = (String) (dzbVar3 instanceof dzb ? null : dzbVar3);
        if (str3 != null && Boolean.parseBoolean(str3)) {
            z = true;
        }
        c = z;
    }
}
