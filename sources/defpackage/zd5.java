package defpackage;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zd5 implements Closeable {
    public static final tl7 a;
    public static final e1a b;

    static {
        tl7 tl7Var;
        try {
            Class.forName("java.nio.file.Files");
            tl7Var = new hf9();
        } catch (ClassNotFoundException unused) {
            tl7Var = new tl7();
        }
        a = tl7Var;
        String str = e1a.b;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        b = y25.r(property);
        ClassLoader classLoader = yxb.class.getClassLoader();
        classLoader.getClass();
        new yxb(classLoader);
    }

    public final void E(e1a e1aVar) {
        e1aVar.getClass();
        x(e1aVar);
    }

    public final boolean G(e1a e1aVar) {
        e1aVar.getClass();
        return U(e1aVar) != null;
    }

    public abstract List N(e1a e1aVar);

    public final ld5 R(e1a e1aVar) throws FileNotFoundException {
        e1aVar.getClass();
        ld5 ld5VarU = U(e1aVar);
        if (ld5VarU != null) {
            return ld5VarU;
        }
        pd4.l(e1aVar, "no such file: ");
        return null;
    }

    public abstract ld5 U(e1a e1aVar);

    public abstract jk7 W(e1a e1aVar);

    public abstract wkd b(e1a e1aVar);

    public abstract wkd g0(e1a e1aVar, boolean z);

    public abstract void h(e1a e1aVar, e1a e1aVar2);

    public abstract mtd h0(e1a e1aVar);

    public final void l(e1a e1aVar) {
        ad0 ad0Var = new ad0();
        while (e1aVar != null && !G(e1aVar)) {
            ad0Var.addFirst(e1aVar);
            e1aVar = e1aVar.c();
        }
        Iterator<E> it = ad0Var.iterator();
        while (it.hasNext()) {
            u((e1a) it.next());
        }
    }

    public abstract void u(e1a e1aVar);

    public abstract void x(e1a e1aVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
