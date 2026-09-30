package defpackage;

import android.graphics.Rect;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface ng1 extends kg1 {
    Set a();

    boolean c();

    String d();

    Rect g();

    default void j(szc szcVar) {
        szcVar.getClass();
        sfc.a = szcVar;
    }

    List o(int i);

    Object q();

    k9b s();

    List t(int i);

    Set v();

    Set w();

    boolean y();

    default ng1 f() {
        return this;
    }
}
