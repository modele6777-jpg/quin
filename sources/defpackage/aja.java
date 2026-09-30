package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aja extends k4 {
    public final em7 a;
    public final List b;
    public final lw7 c;

    public aja(em7 em7Var) {
        em7Var.getClass();
        this.a = em7Var;
        this.b = pu4.a;
        this.c = eb3.N(z18.b, new zv6(29, this));
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return (nyc) this.c.getValue();
    }

    @Override // defpackage.k4
    public final em7 h() {
        return this.a;
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aja(em7 em7Var, Annotation[] annotationArr) {
        this(em7Var);
        em7Var.getClass();
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.b = listAsList;
    }
}
