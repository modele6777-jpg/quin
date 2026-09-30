package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v00 implements u00 {
    public final tt7 a;
    public final Map b;
    public final ntd c;

    public v00(tjd tjdVar, Map map, ntd ntdVar) {
        if (tjdVar == null) {
            a(0);
            throw null;
        }
        this.a = tjdVar;
        this.b = map;
        this.c = ntdVar;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.u00
    public final ntd e() {
        return this.c;
    }

    @Override // defpackage.u00
    public final dx5 f() {
        u09 u09VarD = qz3.d(this);
        if (u09VarD != null) {
            if (sy4.f(u09VarD)) {
                u09VarD = null;
            }
            if (u09VarD != null) {
                return qz3.c(u09VarD);
            }
        }
        return null;
    }

    @Override // defpackage.u00
    public final Map g() {
        return this.b;
    }

    @Override // defpackage.u00
    public final tt7 getType() {
        tt7 tt7Var = this.a;
        if (tt7Var != null) {
            return tt7Var;
        }
        a(3);
        throw null;
    }

    public final String toString() {
        return jz3.c.o(this, null);
    }
}
