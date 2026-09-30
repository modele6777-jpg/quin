package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class oj7 {
    public static final dx5 a;
    public static final j22 b;

    static {
        dx5 dx5Var = new dx5("kotlin.jvm.JvmField");
        a = dx5Var;
        mh3.b0(dx5Var);
        mh3.b0(new dx5("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        b = mh3.z("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        str.getClass();
        return b(str) ? str : "get".concat(ym8.s(str));
    }

    public static final boolean b(String str) {
        char cCharAt;
        str.getClass();
        return c5e.C(str, "is", false) && str.length() != 2 && ('a' > (cCharAt = str.charAt(2)) || cCharAt > 'z');
    }
}
