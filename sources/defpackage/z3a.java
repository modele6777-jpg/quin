package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z3a {
    public static final List a = t72.I(thb.e, thb.a, thb.b, thb.f, thb.g, thb.v);

    public static final String a(bwa bwaVar) {
        if (bwaVar instanceof z6e) {
            return ((z6e) bwaVar).a();
        }
        if (bwaVar instanceof n07) {
            return ((n07) bwaVar).a();
        }
        ap.c();
        return null;
    }

    public static final String b(bwa bwaVar) {
        bwaVar.getClass();
        cwa type = bwaVar.getType();
        if (type == u7e.b) {
            return "limited-monthly";
        }
        if (type == u7e.c) {
            return "limited-annually-discount";
        }
        return type instanceof thb ? "5times" : bwaVar.getType().a();
    }

    public static final double c(bwa bwaVar) {
        if (bwaVar instanceof z6e) {
            return ((z6e) bwaVar).d();
        }
        if (bwaVar instanceof n07) {
            return ((n07) bwaVar).d();
        }
        ap.c();
        return 0.0d;
    }
}
