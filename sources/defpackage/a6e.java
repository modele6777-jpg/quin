package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.q6;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a6e {
    public b41 A;
    public long B;
    public b41 C;
    public boolean D;
    public x4d E;
    public Object F;
    public Object G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public c82 S;
    public long T;
    public b41 U;
    public ete V;
    public long W;
    public long X;
    public long Y;
    public int Z;
    public long a;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float p;
    public float q;
    public float r;
    public float s;
    public b41 y;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public float v = Float.NaN;
    public float w = Float.NaN;
    public long x = y72.b;
    public long z = y72.j;

    public a6e() {
        long j = y72.k;
        this.B = j;
        this.E = g21.f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.J = 1.0f;
        long j2 = r2f.b;
        this.P = r2f.b(j2);
        this.Q = r2f.c(j2);
        this.T = j;
        long j3 = wue.c;
        this.W = j3;
        this.X = j3;
        this.Y = j3;
    }

    public final void A(mne mneVar) {
        this.a |= 274877906944L;
        this.Z = (((mneVar.a | 4) << 14) & 114688) | (this.Z & (-114689));
    }

    public final void B(int i) {
        this.a |= 4398046511104L;
        this.Z = ((i << 4) & 112) | (this.Z & (-113));
    }

    public final void C(float f) {
        this.a = (this.a | 512) & (-2049);
        this.l = f;
        this.n = Float.NaN;
    }

    public final void a(b41 b41Var) {
        this.a &= -17179869185L;
        int i = this.b;
        this.b = b41Var != null ? i | 2 : i & (-3);
        this.A = b41Var;
        int i2 = y72.l;
        this.z = y72.k;
    }

    public final void b(long j) {
        this.a |= 17179869184L;
        this.b &= -3;
        this.z = j;
        this.A = null;
    }

    public final void c(b41 b41Var) {
        this.a &= -34359738369L;
        int i = this.b;
        this.b = b41Var != null ? i | 1 : i & (-2);
        this.y = b41Var;
        int i2 = y72.l;
        this.x = y72.k;
    }

    public final void d(long j) {
        this.a |= 34359738368L;
        this.b &= -2;
        this.x = j;
        this.y = null;
    }

    public final void e(b41 b41Var) {
        this.a &= -137438953473L;
        int i = this.b;
        this.b = b41Var != null ? i | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS : i & (-129);
        this.U = b41Var;
        int i2 = y72.l;
        this.T = y72.k;
    }

    public final void f(a6e a6eVar) {
        a6eVar.a = this.a;
        a6eVar.b = this.b;
        a6eVar.p = this.p;
        a6eVar.q = this.q;
        a6eVar.r = this.r;
        a6eVar.s = this.s;
        a6eVar.t = this.t;
        a6eVar.u = this.u;
        a6eVar.v = this.v;
        a6eVar.w = this.w;
        a6eVar.c = this.c;
        a6eVar.d = this.d;
        a6eVar.e = this.e;
        a6eVar.f = this.f;
        a6eVar.g = this.g;
        a6eVar.h = this.h;
        a6eVar.i = this.i;
        a6eVar.j = this.j;
        a6eVar.k = this.k;
        a6eVar.E = this.E;
        a6eVar.H = this.H;
        a6eVar.I = this.I;
        a6eVar.J = this.J;
        a6eVar.K = this.K;
        a6eVar.L = this.L;
        a6eVar.M = this.M;
        a6eVar.N = this.N;
        a6eVar.O = this.O;
        a6eVar.P = this.P;
        a6eVar.Q = this.Q;
        a6eVar.R = this.R;
        a6eVar.S = this.S;
        a6eVar.x = this.x;
        a6eVar.y = this.y;
        a6eVar.z = this.z;
        a6eVar.A = this.A;
        a6eVar.B = this.B;
        a6eVar.C = this.C;
        a6eVar.F = this.F;
        a6eVar.G = this.G;
        a6eVar.D = this.D;
        a6eVar.l = this.l;
        a6eVar.m = this.m;
        a6eVar.n = this.n;
        a6eVar.o = this.o;
        a6eVar.T = this.T;
        a6eVar.U = this.U;
        a6eVar.V = this.V;
        a6eVar.W = this.W;
        a6eVar.X = this.X;
        a6eVar.Y = this.Y;
        a6eVar.Z = this.Z;
    }

    public final void g(a6e a6eVar, long j, int i) {
        long j2 = j & this.a;
        if (j2 != 0) {
            if ((j2 & 8192) != 0) {
                float f = this.p;
                a6eVar.a = 8192 | a6eVar.a;
                a6eVar.p = f;
            }
            if ((j2 & 16384) != 0) {
                float f2 = this.q;
                a6eVar.a = 16384 | a6eVar.a;
                a6eVar.q = f2;
            }
            if ((j2 & 32768) != 0) {
                float f3 = this.r;
                a6eVar.a = 32768 | a6eVar.a;
                a6eVar.r = f3;
            }
            if ((j2 & 65536) != 0) {
                float f4 = this.s;
                a6eVar.a = 65536 | a6eVar.a;
                a6eVar.s = f4;
            }
            if ((j2 & 262144) != 0) {
                float f5 = this.t;
                a6eVar.a = 262144 | a6eVar.a;
                a6eVar.t = f5;
            }
            if ((j2 & q6.MAX_EVENT_SIZE_BYTES) != 0) {
                float f6 = this.u;
                a6eVar.a = q6.MAX_EVENT_SIZE_BYTES | a6eVar.a;
                a6eVar.u = f6;
            }
            if ((j2 & 131072) != 0) {
                float f7 = this.v;
                a6eVar.a = 131072 | a6eVar.a;
                a6eVar.v = f7;
            }
            if ((j2 & 524288) != 0) {
                float f8 = this.w;
                a6eVar.a = 524288 | a6eVar.a;
                a6eVar.w = f8;
            }
            if ((j2 & 1) != 0) {
                float f9 = this.c;
                a6eVar.a = 1 | a6eVar.a;
                a6eVar.c = f9;
            }
            if ((j2 & 2) != 0) {
                float f10 = this.d;
                a6eVar.a = 2 | a6eVar.a;
                a6eVar.d = f10;
            }
            if ((j2 & 4) != 0) {
                float f11 = this.e;
                a6eVar.a = 4 | a6eVar.a;
                a6eVar.e = f11;
            }
            if ((j2 & 8) != 0) {
                float f12 = this.f;
                a6eVar.a = 8 | a6eVar.a;
                a6eVar.f = f12;
            }
            if ((j2 & 16) != 0) {
                float f13 = this.g;
                a6eVar.a = 16 | a6eVar.a;
                a6eVar.g = f13;
            }
            if ((j2 & 32) != 0) {
                float f14 = this.h;
                a6eVar.a = 32 | a6eVar.a;
                a6eVar.h = f14;
            }
            if ((j2 & 64) != 0) {
                float f15 = this.i;
                a6eVar.a = 64 | a6eVar.a;
                a6eVar.i = f15;
            }
            if ((j2 & 128) != 0) {
                float f16 = this.j;
                a6eVar.a = 128 | a6eVar.a;
                a6eVar.j = f16;
            }
            if ((j2 & 256) != 0) {
                float f17 = this.k;
                a6eVar.a = 256 | a6eVar.a;
                a6eVar.k = f17;
            }
            if ((j2 & 2097152) != 0) {
                float f18 = this.H;
                a6eVar.a = 2097152 | a6eVar.a;
                a6eVar.H = f18;
            }
            if ((j2 & 4194304) != 0) {
                float f19 = this.I;
                a6eVar.a = 4194304 | a6eVar.a;
                a6eVar.I = f19;
            }
            if ((j2 & 8388608) != 0) {
                float f20 = this.J;
                a6eVar.a = 8388608 | a6eVar.a;
                a6eVar.J = f20;
            }
            if ((j2 & 16777216) != 0) {
                float f21 = this.K;
                a6eVar.a = 16777216 | a6eVar.a;
                a6eVar.K = f21;
            }
            if ((j2 & 33554432) != 0) {
                float f22 = this.L;
                a6eVar.a = 33554432 | a6eVar.a;
                a6eVar.L = f22;
            }
            if ((j2 & 67108864) != 0) {
                float f23 = this.M;
                a6eVar.a = 67108864 | a6eVar.a;
                a6eVar.M = f23;
            }
            if ((j2 & 134217728) != 0) {
                float f24 = this.N;
                a6eVar.a = 134217728 | a6eVar.a;
                a6eVar.N = f24;
            }
            if ((j2 & 268435456) != 0) {
                float f25 = this.O;
                a6eVar.a = 268435456 | a6eVar.a;
                a6eVar.O = f25;
            }
            if ((j2 & 536870912) != 0) {
                float f26 = this.P;
                a6eVar.a = 536870912 | a6eVar.a;
                a6eVar.P = f26;
            }
            if ((j2 & 1073741824) != 0) {
                float f27 = this.Q;
                a6eVar.a = 1073741824 | a6eVar.a;
                a6eVar.Q = f27;
            }
            if ((j2 & 4294967296L) != 0) {
                float f28 = this.R;
                a6eVar.a = 4294967296L | a6eVar.a;
                a6eVar.R = f28;
            }
            if ((j2 & 8589934592L) != 0) {
                a6eVar.a = 8589934592L | a6eVar.a;
            }
            if ((34359738368L & j2) != 0) {
                a6eVar.d(this.x);
            }
            if ((17179869184L & j2) != 0) {
                a6eVar.b(this.z);
            }
            if ((j2 & 68719476736L) != 0) {
                long j3 = this.B;
                a6eVar.a = 68719476736L | a6eVar.a;
                a6eVar.b &= -5;
                a6eVar.B = j3;
                a6eVar.C = null;
            }
            if ((j2 & 2147483648L) != 0) {
                boolean z = this.D;
                a6eVar.a = 2147483648L | a6eVar.a;
                a6eVar.D = z;
            }
            if ((512 & j2) != 0) {
                a6eVar.C(this.l);
            }
            if ((1024 & j2) != 0) {
                a6eVar.x(this.m);
            }
            if ((j2 & 2048) != 0) {
                float f29 = this.n;
                a6eVar.a = 2048 | (a6eVar.a & (-513));
                a6eVar.n = f29;
                a6eVar.l = Float.NaN;
            }
            if ((j2 & 4096) != 0) {
                float f30 = this.o;
                a6eVar.a = 4096 | (a6eVar.a & (-1025));
                a6eVar.o = f30;
                a6eVar.m = Float.NaN;
            }
            if ((j2 & 137438953472L) != 0) {
                long j4 = this.T;
                a6eVar.a = 137438953472L | a6eVar.a;
                a6eVar.b &= -129;
                a6eVar.T = j4;
                a6eVar.U = null;
            }
            if ((j2 & 140737488355328L) != 0) {
                long j5 = this.X;
                a6eVar.a = 140737488355328L | a6eVar.a;
                a6eVar.X = j5;
            }
            if ((j2 & 281474976710656L) != 0) {
                long j6 = this.Y;
                a6eVar.a = 281474976710656L | a6eVar.a;
                a6eVar.Y = j6;
            }
            if ((j2 & 8796093022208L) != 0) {
                a6eVar.a = 8796093022208L | a6eVar.a;
            }
            if ((j2 & 562949953421312L) != 0) {
                a6eVar.a = 562949953421312L | a6eVar.a;
            }
            if ((131666517426176L & j2) != 0) {
                if ((274877906944L & j2) != 0) {
                    a6eVar.A(t());
                }
                if ((j2 & 70368744177664L) != 0) {
                    long j7 = this.W;
                    a6eVar.a = 70368744177664L | a6eVar.a;
                    a6eVar.W = j7;
                }
                if ((2199023255552L & j2) != 0) {
                    a6eVar.z(s());
                }
                if ((4398046511104L & j2) != 0) {
                    a6eVar.B(u());
                }
                if ((17592186044416L & j2) != 0) {
                    a6eVar.y(q());
                }
                if ((35184372088832L & j2) != 0) {
                    a6eVar.k(o());
                }
                if ((549755813888L & j2) != 0) {
                    a6eVar.l(p());
                }
                if ((j2 & 1099511627776L) != 0) {
                    a6eVar.j(n());
                }
            }
        }
        int i2 = this.b & i;
        if (i2 != 0) {
            if ((i2 & 8) != 0) {
                x4d x4dVar = this.E;
                a6eVar.b |= 8;
                a6eVar.E = x4dVar;
            }
            if ((i2 & 16) != 0) {
                c82 c82Var = this.S;
                a6eVar.b |= 16;
                a6eVar.S = c82Var;
            }
            if ((i2 & 1) != 0) {
                a6eVar.c(this.y);
            }
            if ((i2 & 2) != 0) {
                a6eVar.a(this.A);
            }
            if ((i2 & 4) != 0) {
                a6eVar.m(this.C);
            }
            if ((i2 & 32) != 0) {
                Object obj = this.F;
                int i3 = a6eVar.b;
                a6eVar.b = obj != null ? i3 | 32 : i3 & (-33);
                a6eVar.F = obj;
            }
            if ((i2 & 64) != 0) {
                Object obj2 = this.G;
                int i4 = a6eVar.b;
                a6eVar.b = obj2 != null ? i4 | 64 : i4 & (-65);
                a6eVar.G = obj2;
            }
            if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                a6eVar.e(this.U);
            }
            if ((i2 & 256) != 0) {
                a6eVar.b |= 256;
            }
            if ((i2 & 512) != 0) {
                a6eVar.b |= 512;
            }
            if ((i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                ete eteVar = this.V;
                eteVar.getClass();
                a6eVar.b |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                a6eVar.V = eteVar;
            }
        }
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
    public final int h(int i, a6e a6eVar) {
        int i2 = this.b;
        int i3 = a6eVar.b;
        int i4 = i2 & i3 & i;
        int i5 = i & (i2 ^ i3);
        if (i4 == 0) {
            return i5;
        }
        if ((i4 & 1) != 0 && pa7.t(this.y, a6eVar.y)) {
            i4 &= -2;
        }
        if ((i4 & 2) != 0 && pa7.t(this.A, a6eVar.A)) {
            i4 &= -3;
        }
        if ((i4 & 4) != 0 && pa7.t(this.C, a6eVar.C)) {
            i4 &= -5;
        }
        if ((i4 & 8) != 0 && pa7.t(this.E, a6eVar.E)) {
            i4 &= -9;
        }
        if ((i4 & 16) != 0 && pa7.t(this.S, a6eVar.S)) {
            i4 &= -17;
        }
        if ((i4 & 32) != 0 && pa7.t(this.F, a6eVar.F)) {
            i4 &= -33;
        }
        if ((i4 & 64) != 0 && pa7.t(this.G, a6eVar.G)) {
            i4 &= -65;
        }
        if ((i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 && pa7.t(this.U, a6eVar.U)) {
            i4 &= -129;
        }
        if ((i4 & 256) != 0) {
            i4 &= -257;
        }
        if ((i4 & 512) != 0) {
            cue cueVar = cue.c;
            if (cueVar.equals(cueVar)) {
                i4 &= -513;
            }
        }
        if ((i4 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && pa7.t(this.V, a6eVar.V)) {
            i4 &= -1025;
        }
        return i4 | i5;
    }

    public final long i(a6e a6eVar, long j) {
        long j2 = this.a;
        long j3 = a6eVar.a;
        long j4 = j2 & j3 & j;
        long j5 = j & (j2 ^ j3);
        if (j4 == 0) {
            return j5;
        }
        if ((1 & j4) != 0 && Float.floatToRawIntBits(this.c) == Float.floatToRawIntBits(a6eVar.c)) {
            j4 &= -2;
        }
        if ((2 & j4) != 0 && Float.floatToRawIntBits(this.d) == Float.floatToRawIntBits(a6eVar.d)) {
            j4 &= -3;
        }
        if ((4 & j4) != 0 && Float.floatToRawIntBits(this.e) == Float.floatToRawIntBits(a6eVar.e)) {
            j4 &= -5;
        }
        if ((8 & j4) != 0 && Float.floatToRawIntBits(this.f) == Float.floatToRawIntBits(a6eVar.f)) {
            j4 &= -9;
        }
        if ((16 & j4) != 0 && Float.floatToRawIntBits(this.g) == Float.floatToRawIntBits(a6eVar.g)) {
            j4 &= -17;
        }
        if ((32 & j4) != 0 && Float.floatToRawIntBits(this.h) == Float.floatToRawIntBits(a6eVar.h)) {
            j4 &= -33;
        }
        if ((64 & j4) != 0 && Float.floatToRawIntBits(this.i) == Float.floatToRawIntBits(a6eVar.i)) {
            j4 &= -65;
        }
        if ((128 & j4) != 0 && Float.floatToRawIntBits(this.j) == Float.floatToRawIntBits(a6eVar.j)) {
            j4 &= -129;
        }
        if ((256 & j4) != 0 && Float.floatToRawIntBits(this.k) == Float.floatToRawIntBits(a6eVar.k)) {
            j4 &= -257;
        }
        if ((512 & j4) != 0 && Float.floatToRawIntBits(this.l) == Float.floatToRawIntBits(a6eVar.l)) {
            j4 &= -513;
        }
        if ((1024 & j4) != 0 && Float.floatToRawIntBits(this.m) == Float.floatToRawIntBits(a6eVar.m)) {
            j4 &= -1025;
        }
        if ((2048 & j4) != 0 && Float.floatToRawIntBits(this.n) == Float.floatToRawIntBits(a6eVar.n)) {
            j4 &= -2049;
        }
        if ((4096 & j4) != 0 && Float.floatToRawIntBits(this.o) == Float.floatToRawIntBits(a6eVar.o)) {
            j4 &= -4097;
        }
        if ((8192 & j4) != 0 && Float.floatToRawIntBits(this.p) == Float.floatToRawIntBits(a6eVar.p)) {
            j4 &= -8193;
        }
        if ((16384 & j4) != 0 && Float.floatToRawIntBits(this.q) == Float.floatToRawIntBits(a6eVar.q)) {
            j4 &= -16385;
        }
        if ((32768 & j4) != 0 && Float.floatToRawIntBits(this.r) == Float.floatToRawIntBits(a6eVar.r)) {
            j4 &= -32769;
        }
        if ((65536 & j4) != 0 && Float.floatToRawIntBits(this.s) == Float.floatToRawIntBits(a6eVar.s)) {
            j4 &= -65537;
        }
        if ((131072 & j4) != 0 && Float.floatToRawIntBits(this.v) == Float.floatToRawIntBits(a6eVar.v)) {
            j4 &= -131073;
        }
        if ((262144 & j4) != 0 && Float.floatToRawIntBits(this.t) == Float.floatToRawIntBits(a6eVar.t)) {
            j4 &= -262145;
        }
        if ((524288 & j4) != 0 && Float.floatToRawIntBits(this.w) == Float.floatToRawIntBits(a6eVar.w)) {
            j4 &= -524289;
        }
        if ((q6.MAX_EVENT_SIZE_BYTES & j4) != 0 && Float.floatToRawIntBits(this.u) == Float.floatToRawIntBits(a6eVar.u)) {
            j4 &= -1048577;
        }
        if ((2097152 & j4) != 0 && Float.floatToRawIntBits(this.H) == Float.floatToRawIntBits(a6eVar.H)) {
            j4 &= -2097153;
        }
        if ((4194304 & j4) != 0 && Float.floatToRawIntBits(this.I) == Float.floatToRawIntBits(a6eVar.I)) {
            j4 &= -4194305;
        }
        if ((8388608 & j4) != 0 && Float.floatToRawIntBits(this.J) == Float.floatToRawIntBits(a6eVar.J)) {
            j4 &= -8388609;
        }
        if ((16777216 & j4) != 0 && Float.floatToRawIntBits(this.K) == Float.floatToRawIntBits(a6eVar.K)) {
            j4 &= -16777217;
        }
        if ((33554432 & j4) != 0 && Float.floatToRawIntBits(this.L) == Float.floatToRawIntBits(a6eVar.L)) {
            j4 &= -33554433;
        }
        if ((67108864 & j4) != 0 && Float.floatToRawIntBits(this.M) == Float.floatToRawIntBits(a6eVar.M)) {
            j4 &= -67108865;
        }
        if ((134217728 & j4) != 0 && Float.floatToRawIntBits(this.N) == Float.floatToRawIntBits(a6eVar.N)) {
            j4 &= -134217729;
        }
        if ((268435456 & j4) != 0 && Float.floatToRawIntBits(this.O) == Float.floatToRawIntBits(a6eVar.O)) {
            j4 &= -268435457;
        }
        if ((536870912 & j4) != 0 && Float.floatToRawIntBits(this.P) == Float.floatToRawIntBits(a6eVar.P)) {
            j4 &= -536870913;
        }
        if ((1073741824 & j4) != 0 && Float.floatToRawIntBits(this.Q) == Float.floatToRawIntBits(a6eVar.Q)) {
            j4 &= -1073741825;
        }
        if ((2147483648L & j4) != 0 && this.D == a6eVar.D) {
            j4 &= -2147483649L;
        }
        if ((4294967296L & j4) != 0 && Float.floatToRawIntBits(this.R) == Float.floatToRawIntBits(a6eVar.R)) {
            j4 &= -4294967297L;
        }
        if ((8589934592L & j4) != 0 && Float.floatToRawIntBits(1.0f) == Float.floatToRawIntBits(1.0f)) {
            j4 &= -8589934593L;
        }
        if ((17179869184L & j4) != 0) {
            long j6 = this.z;
            long j7 = a6eVar.z;
            int i = y72.l;
            if (faf.a(j6, j7)) {
                j4 &= -17179869185L;
            }
        }
        if ((34359738368L & j4) != 0) {
            long j8 = this.x;
            long j9 = a6eVar.x;
            int i2 = y72.l;
            if (faf.a(j8, j9)) {
                j4 &= -34359738369L;
            }
        }
        if ((68719476736L & j4) != 0) {
            long j10 = this.B;
            long j11 = a6eVar.B;
            int i3 = y72.l;
            if (faf.a(j10, j11)) {
                j4 &= -68719476737L;
            }
        }
        if ((137438953472L & j4) != 0) {
            long j12 = this.T;
            long j13 = a6eVar.T;
            int i4 = y72.l;
            if (faf.a(j12, j13)) {
                j4 &= -137438953473L;
            }
        }
        if ((274877906944L & j4) != 0 && t().equals(a6eVar.t())) {
            j4 &= -274877906945L;
        }
        if ((549755813888L & j4) != 0 && pa7.t(p(), a6eVar.p())) {
            j4 &= -549755813889L;
        }
        if ((1099511627776L & j4) != 0 && n() == a6eVar.n()) {
            j4 &= -1099511627777L;
        }
        if ((2199023255552L & j4) != 0 && s() == a6eVar.s()) {
            j4 &= -2199023255553L;
        }
        if ((4398046511104L & j4) != 0 && u() == a6eVar.u()) {
            j4 &= -4398046511105L;
        }
        if ((8796093022208L & j4) != 0 && Float.compare(Float.NaN, Float.NaN) == 0) {
            j4 &= -8796093022209L;
        }
        if ((17592186044416L & j4) != 0 && q() == a6eVar.q()) {
            j4 &= -17592186044417L;
        }
        if ((35184372088832L & j4) != 0 && o() == a6eVar.o()) {
            j4 &= -35184372088833L;
        }
        if ((70368744177664L & j4) != 0 && wue.a(this.W, a6eVar.W)) {
            j4 &= -70368744177665L;
        }
        if ((140737488355328L & j4) != 0 && wue.a(this.X, a6eVar.X)) {
            j4 &= -140737488355329L;
        }
        if ((281474976710656L & j4) != 0 && wue.a(this.Y, a6eVar.Y)) {
            j4 &= -281474976710657L;
        }
        if ((562949953421312L & j4) != 0) {
            j4 &= -562949953421313L;
        }
        return j4 | j5;
    }

    public final void j(int i) {
        this.a |= 1099511627776L;
        this.Z = ((i | 2) & 3) | (this.Z & (-4));
    }

    public final void k(int i) {
        this.a |= 35184372088832L;
        this.Z = ((i << 10) & 15360) | (this.Z & (-15361));
    }

    public final void l(ar5 ar5Var) {
        this.a |= 549755813888L;
        this.Z = ((ar5Var.a << 17) & 134086656) | (this.Z & (-134086657));
    }

    public final void m(b41 b41Var) {
        this.a &= -68719476737L;
        int i = this.b;
        this.b = b41Var != null ? i | 4 : i & (-5);
        this.C = b41Var;
        int i2 = y72.l;
        this.B = y72.k;
    }

    public final int n() {
        return ((this.a & 1099511627776L) == 0 || (this.Z & 1) != 1) ? 0 : 1;
    }

    public final int o() {
        if ((this.a & 35184372088832L) == 0) {
            return 0;
        }
        int i = ((this.Z & 15360) >> 10) & 15;
        if (i != 0 && i != 1 && i != 2 && i != 65535) {
            j37.a("The given value=" + i + " is not recognized by FontSynthesis.");
        }
        return i;
    }

    public final ar5 p() {
        if ((this.a & 549755813888L) != 0) {
            return new ar5((this.Z & 134086656) >> 17);
        }
        ar5 ar5Var = ar5.b;
        return ar5.w;
    }

    public final int q() {
        if ((this.a & 17592186044416L) == 0) {
            return 0;
        }
        int i = (this.Z & 768) >> 8;
        if (i >= 0 && i < 3) {
            return i;
        }
        j37.a("The given value=" + i + " is not recognized by Hyphens.");
        return i;
    }

    public final int r() {
        return b6e.e(this.b) | b6e.g(this.a);
    }

    public final int s() {
        if ((this.a & 2199023255552L) == 0) {
            return 0;
        }
        int i = (this.Z & 28) >> 2;
        if (i >= 0 && i < 7) {
            return i;
        }
        j37.a("The given value=" + i + " is not recognized by TextAlign.");
        return i;
    }

    public final mne t() {
        int i;
        long j = this.a & 274877906944L;
        mne mneVar = mne.b;
        if (j == 0 || (i = ((this.Z & 114688) >> 14) & 3) == 0) {
            return mneVar;
        }
        if (i != 1) {
            return i != 2 ? new mne(i) : mne.d;
        }
        return mne.c;
    }

    public final int u() {
        if ((this.a & 4398046511104L) == 0) {
            return 0;
        }
        int i = (this.Z & 112) >> 4;
        if (i >= 0 && i < 6) {
            return i;
        }
        j37.a("The given value=" + i + " is not recognized by TextDirection.");
        return i;
    }

    public final boolean v(byte b) {
        return b < 50 && ((1 << b) & this.a) != 0;
    }

    public final boolean w(int i) {
        return i >= 50 && (this.b & (1 << (i - 50))) != 0;
    }

    public final void x(float f) {
        this.a = (this.a | 1024) & (-4097);
        this.m = f;
        this.o = Float.NaN;
    }

    public final void y(int i) {
        this.a |= 17592186044416L;
        this.Z = ((i << 8) & 768) | (this.Z & (-769));
    }

    public final void z(int i) {
        this.a |= 2199023255552L;
        this.Z = ((i << 2) & 28) | (this.Z & (-29));
    }
}
