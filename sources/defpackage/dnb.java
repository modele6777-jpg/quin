package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dnb extends h36 implements a26 {
    public static final dnb a = new dnb(1, onb.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);

    @Override // defpackage.a26
    public final Object d(Object obj) {
        Method method = (Method) obj;
        method.getClass();
        return new onb(method);
    }
}
