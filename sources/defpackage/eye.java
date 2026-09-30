package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eye {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;

    static {
        kv2.v(0, 1, 2, 3, 4);
        pqf.D(5);
        pqf.D(6);
    }

    public eye() {
        qf qfVar = qf.c;
    }

    public final long a(int i, int i2) {
        of ofVarA = qf.c.a(i);
        if (ofVarA.a != -1) {
            return ofVarA.e[i2];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        of ofVarA;
        int i;
        qf qfVar = qf.c;
        long j2 = this.d;
        int i2 = qfVar.a;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i3 = 0;
            while (i3 < i2) {
                qfVar.a(i3).getClass();
                qfVar.a(i3).getClass();
                if (0 > j && ((i = (ofVarA = qfVar.a(i3)).a) == -1 || ofVarA.a(-1) < i)) {
                    break;
                }
                i3++;
            }
            if (i3 < i2) {
                if (j2 != -9223372036854775807L) {
                    qfVar.a(i3).getClass();
                    if (0 <= j2) {
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    public final int c(long j) {
        qf qfVar = qf.c;
        int i = qfVar.a;
        int i2 = i - 1;
        if (i2 == i - 1) {
            qfVar.a(i2).getClass();
        }
        while (i2 >= 0 && j != Long.MIN_VALUE) {
            qfVar.a(i2).getClass();
            if (j >= 0) {
                break;
            }
            i2--;
        }
        if (i2 >= 0) {
            of ofVarA = qfVar.a(i2);
            int i3 = ofVarA.a;
            if (i3 != -1) {
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = ofVarA.d[i4];
                    if (i5 != 0 && i5 != 1) {
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    public final long d(int i) {
        qf.c.a(i).getClass();
        return 0L;
    }

    public final int e(int i) {
        return qf.c.a(i).a(-1);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !eye.class.equals(obj.getClass())) {
            return false;
        }
        eye eyeVar = (eye) obj;
        if (!Objects.equals(this.a, eyeVar.a) || !Objects.equals(this.b, eyeVar.b) || this.c != eyeVar.c || this.d != eyeVar.d || this.e != eyeVar.e || this.f != eyeVar.f) {
            return false;
        }
        qf qfVar = qf.c;
        return qfVar.equals(qfVar);
    }

    public final boolean f(int i) {
        qf qfVar = qf.c;
        int i2 = qfVar.a;
        if (i != i2 - 1 || i != i2 - 1) {
            return false;
        }
        qfVar.a(i).getClass();
        return false;
    }

    public final boolean g(int i) {
        qf.c.a(i).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i, long j, long j2, boolean z) {
        qf qfVar = qf.c;
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j = this.d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        return qf.c.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
