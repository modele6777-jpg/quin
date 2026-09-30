package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface vqg {
    public static final grg v0 = new grg();
    public static final tqg w0 = new tqg();
    public static final fog x0 = new fog("continue");
    public static final fog y0 = new fog("break");
    public static final fog z0 = new fog("return");
    public static final lng A0 = new lng(Boolean.TRUE);
    public static final lng B0 = new lng(Boolean.FALSE);
    public static final erg C0 = new erg("");

    Boolean a();

    Iterator c();

    String d();

    vqg g(String str, kxa kxaVar, ArrayList arrayList);

    Double j();

    vqg m();
}
