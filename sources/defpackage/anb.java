package defpackage;

import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class anb extends h36 implements a26 {
    public static final anb a = new anb(1, inb.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);

    @Override // defpackage.a26
    public final Object d(Object obj) {
        Constructor constructor = (Constructor) obj;
        constructor.getClass();
        return new inb(constructor);
    }
}
