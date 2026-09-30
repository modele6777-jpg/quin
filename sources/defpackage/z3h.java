package defpackage;

import android.os.Build;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z3h extends omg {
    private static final z3h zzaw;
    private static volatile tng zzax;
    private long zzA;
    private int zzB;
    private String zzC;
    private String zzD;
    private boolean zzE;
    private zmg zzF;
    private String zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private String zzK;
    private long zzL;
    private long zzM;
    private String zzN;
    private String zzO;
    private int zzP;
    private String zzQ;
    private c4h zzR;
    private umg zzS;
    private long zzT;
    private long zzU;
    private String zzV;
    private String zzW;
    private int zzX;
    private boolean zzY;
    private String zzZ;
    private boolean zzaa;
    private k3h zzab;
    private String zzac;
    private zmg zzad;
    private String zzae;
    private long zzaf;
    private boolean zzag;
    private String zzah;
    private boolean zzai;
    private String zzaj;
    private int zzak;
    private String zzal;
    private w1h zzam;
    private int zzan;
    private o1h zzao;
    private String zzap;
    private m4h zzaq;
    private long zzar;
    private String zzas;
    private n2h zzat;
    private String zzau;
    private zmg zzav;
    private int zzb;
    private int zze;
    private int zzf;
    private zmg zzg;
    private zmg zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private int zzr;
    private String zzs;
    private String zzt;
    private String zzu;
    private long zzv;
    private long zzw;
    private String zzx;
    private boolean zzy;
    private String zzz;

    static {
        z3h z3hVar = new z3h();
        zzaw = z3hVar;
        omg.m(z3h.class, z3hVar);
    }

    public z3h() {
        wng wngVar = wng.e;
        this.zzg = wngVar;
        this.zzh = wngVar;
        this.zzn = "";
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzs = "";
        this.zzt = "";
        this.zzu = "";
        this.zzx = "";
        this.zzz = "";
        this.zzC = "";
        this.zzD = "";
        this.zzF = wngVar;
        this.zzG = "";
        this.zzK = "";
        this.zzN = "";
        this.zzO = "";
        this.zzQ = "";
        this.zzS = pmg.e;
        this.zzV = "";
        this.zzW = "";
        this.zzZ = "";
        this.zzac = "";
        this.zzad = wngVar;
        this.zzae = "";
        this.zzah = "";
        this.zzaj = "";
        this.zzal = "";
        this.zzap = "";
        this.zzas = "";
        this.zzau = "";
        this.zzav = wngVar;
    }

    public static u3h W() {
        return (u3h) zzaw.h();
    }

    public static u3h X(z3h z3hVar) {
        mmg mmgVarH = zzaw.h();
        mmgVarH.f(z3hVar);
        return (u3h) mmgVarH;
    }

    public final String A() {
        return this.zzz;
    }

    public final long A0() {
        return this.zzaf;
    }

    public final /* synthetic */ void A1(String str) {
        str.getClass();
        this.zzb |= 65536;
        this.zzx = str;
    }

    public final boolean B() {
        return (this.zzb & 524288) != 0;
    }

    public final boolean B0() {
        return this.zzag;
    }

    public final /* synthetic */ void B1() {
        this.zzb &= -65537;
        this.zzx = zzaw.zzx;
    }

    public final long C() {
        return this.zzA;
    }

    public final boolean C0() {
        return (this.zze & 131072) != 0;
    }

    public final /* synthetic */ void C1(boolean z) {
        this.zzb |= 131072;
        this.zzy = z;
    }

    public final boolean D() {
        return (this.zzb & 1048576) != 0;
    }

    public final String D0() {
        return this.zzah;
    }

    public final /* synthetic */ void D1() {
        this.zzb &= -131073;
        this.zzy = false;
    }

    public final int E() {
        return this.zzB;
    }

    public final boolean E0() {
        return (this.zze & 262144) != 0;
    }

    public final /* synthetic */ void E1(String str) {
        this.zzb |= 262144;
        this.zzz = str;
    }

    public final String F() {
        return this.zzC;
    }

    public final boolean F0() {
        return this.zzai;
    }

    public final /* synthetic */ void F1() {
        this.zzb &= -262145;
        this.zzz = zzaw.zzz;
    }

    public final String G() {
        return this.zzD;
    }

    public final boolean G0() {
        return (this.zze & 524288) != 0;
    }

    public final /* synthetic */ void G1(long j) {
        this.zzb |= 524288;
        this.zzA = j;
    }

    public final boolean H() {
        return (this.zzb & 8388608) != 0;
    }

    public final String H0() {
        return this.zzaj;
    }

    public final /* synthetic */ void H1(int i) {
        this.zzb |= 1048576;
        this.zzB = i;
    }

    public final boolean I() {
        return this.zzE;
    }

    public final int I0() {
        return this.zzak;
    }

    public final /* synthetic */ void I1(String str) {
        this.zzb |= 2097152;
        this.zzC = str;
    }

    public final zmg J() {
        return this.zzF;
    }

    public final boolean J0() {
        return (this.zze & 4194304) != 0;
    }

    public final /* synthetic */ void J1() {
        this.zzb &= -2097153;
        this.zzC = zzaw.zzC;
    }

    public final String K() {
        return this.zzG;
    }

    public final w1h K0() {
        w1h w1hVar = this.zzam;
        return w1hVar == null ? w1h.z() : w1hVar;
    }

    public final /* synthetic */ void K1(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzD = str;
    }

    public final boolean L() {
        return (this.zzb & 33554432) != 0;
    }

    public final boolean L0() {
        return (this.zze & 8388608) != 0;
    }

    public final /* synthetic */ void L1() {
        this.zzb |= 8388608;
        this.zzE = false;
    }

    public final int M() {
        return this.zzH;
    }

    public final int M0() {
        return this.zzan;
    }

    public final void M1(ArrayList arrayList) {
        zmg zmgVarE = this.zzF;
        if (!((rlg) zmgVarE).a) {
            zmgVarE = xkg.e(zmgVarE);
            this.zzF = zmgVarE;
        }
        mmg.b(arrayList, zmgVarE);
    }

    public final boolean N() {
        return (this.zzb & 536870912) != 0;
    }

    public final boolean N0() {
        return (this.zze & 16777216) != 0;
    }

    public final void N1() {
        this.zzF = wng.e;
    }

    public final long O() {
        return this.zzL;
    }

    public final o1h O0() {
        o1h o1hVar = this.zzao;
        return o1hVar == null ? o1h.X() : o1hVar;
    }

    public final /* synthetic */ void O1(String str) {
        this.zzb |= 16777216;
        this.zzG = str;
    }

    public final boolean P() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean P0() {
        return (this.zze & 67108864) != 0;
    }

    public final /* synthetic */ void P1(int i) {
        this.zzb |= 33554432;
        this.zzH = i;
    }

    public final String Q() {
        return this.zzN;
    }

    public final m4h Q0() {
        m4h m4hVar = this.zzaq;
        return m4hVar == null ? m4h.t() : m4hVar;
    }

    public final /* synthetic */ void Q1() {
        this.zzb &= -268435457;
        this.zzK = zzaw.zzK;
    }

    public final boolean R() {
        return (this.zzb & 1) != 0;
    }

    public final int R0() {
        return this.zzf;
    }

    public final List R1() {
        return this.zzg;
    }

    public final boolean S() {
        return (this.zze & 134217728) != 0;
    }

    public final /* synthetic */ void S0(long j) {
        this.zzb |= 536870912;
        this.zzL = j;
    }

    public final void S1() {
        zmg zmgVar = this.zzg;
        if (((rlg) zmgVar).a) {
            return;
        }
        this.zzg = xkg.e(zmgVar);
    }

    public final long T() {
        return this.zzar;
    }

    public final /* synthetic */ void T0(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzN = str;
    }

    public final void T1() {
        zmg zmgVar = this.zzh;
        if (((rlg) zmgVar).a) {
            return;
        }
        this.zzh = xkg.e(zmgVar);
    }

    public final boolean U() {
        return (this.zze & 536870912) != 0;
    }

    public final /* synthetic */ void U0() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzN = zzaw.zzN;
    }

    public final void U1(List list) {
        zmg zmgVarE = this.zzav;
        if (!((rlg) zmgVarE).a) {
            zmgVarE = xkg.e(zmgVarE);
            this.zzav = zmgVarE;
        }
        mmg.b(list, zmgVarE);
    }

    public final n2h V() {
        n2h n2hVar = this.zzat;
        return n2hVar == null ? n2h.t() : n2hVar;
    }

    public final /* synthetic */ void V0(int i) {
        this.zze |= 2;
        this.zzP = i;
    }

    public final int V1() {
        return this.zzg.size();
    }

    public final void W0(List list) {
        List list2 = this.zzS;
        boolean z = ((rlg) list2).a;
        List list3 = list2;
        if (!z) {
            pmg pmgVar = (pmg) list2;
            int i = pmgVar.c;
            pmg pmgVarC = pmgVar.k0(i + i);
            this.zzS = pmgVarC;
            list3 = pmgVarC;
        }
        mmg.b(list, list3);
    }

    public final v2h W1(int i) {
        return (v2h) this.zzg.get(i);
    }

    public final /* synthetic */ void X0(long j) {
        this.zze |= 16;
        this.zzT = j;
    }

    public final zmg X1() {
        return this.zzh;
    }

    public final /* synthetic */ void Y() {
        this.zzb |= 1;
        this.zzf = 1;
    }

    public final /* synthetic */ void Y0(long j) {
        this.zze |= 32;
        this.zzU = j;
    }

    public final int Y1() {
        return this.zzh.size();
    }

    public final /* synthetic */ void Z(int i, v2h v2hVar) {
        S1();
        this.zzg.set(i, v2hVar);
    }

    public final /* synthetic */ void Z0(String str) {
        this.zze |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        this.zzW = str;
    }

    public final p4h Z1(int i) {
        return (p4h) this.zzh.get(i);
    }

    public final /* synthetic */ void a0(v2h v2hVar) {
        S1();
        this.zzg.add(v2hVar);
    }

    public final /* synthetic */ void a1(String str) {
        str.getClass();
        this.zze |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
        this.zzac = str;
    }

    public final boolean a2() {
        return (this.zzb & 2) != 0;
    }

    public final void b0(Iterable iterable) {
        S1();
        mmg.b(iterable, this.zzg);
    }

    public final /* synthetic */ void b1() {
        this.zze &= -8193;
        this.zzac = zzaw.zzac;
    }

    public final long b2() {
        return this.zzi;
    }

    public final void c0() {
        this.zzg = wng.e;
    }

    public final void c1(Set set) {
        zmg zmgVarE = this.zzad;
        if (!((rlg) zmgVarE).a) {
            zmgVarE = xkg.e(zmgVarE);
            this.zzad = zmgVarE;
        }
        mmg.b(set, zmgVarE);
    }

    public final boolean c2() {
        return (this.zzb & 4) != 0;
    }

    public final /* synthetic */ void d0(int i) {
        S1();
        this.zzg.remove(i);
    }

    public final /* synthetic */ void d1(String str) {
        str.getClass();
        this.zze |= 16384;
        this.zzae = str;
    }

    public final long d2() {
        return this.zzj;
    }

    public final /* synthetic */ void e0(int i, p4h p4hVar) {
        T1();
        this.zzh.set(i, p4hVar);
    }

    public final /* synthetic */ void e1(long j) {
        this.zze |= 32768;
        this.zzaf = j;
    }

    public final boolean e2() {
        return (this.zzb & 8) != 0;
    }

    public final /* synthetic */ void f0(p4h p4hVar) {
        T1();
        this.zzh.add(p4hVar);
    }

    public final /* synthetic */ void f1(boolean z) {
        this.zze |= 65536;
        this.zzag = z;
    }

    public final long f2() {
        return this.zzk;
    }

    public final /* synthetic */ void g0(int i) {
        T1();
        this.zzh.remove(i);
    }

    public final /* synthetic */ void g1(String str) {
        this.zze |= 131072;
        this.zzah = str;
    }

    public final boolean g2() {
        return (this.zzb & 16) != 0;
    }

    public final /* synthetic */ void h0(long j) {
        this.zzb |= 2;
        this.zzi = j;
    }

    public final /* synthetic */ void h1(boolean z) {
        this.zze |= 262144;
        this.zzai = z;
    }

    public final long h2() {
        return this.zzl;
    }

    public final /* synthetic */ void i0() {
        this.zzb &= -3;
        this.zzi = 0L;
    }

    public final /* synthetic */ void i1(String str) {
        str.getClass();
        this.zze |= 524288;
        this.zzaj = str;
    }

    public final boolean i2() {
        return (this.zzb & 32) != 0;
    }

    public final /* synthetic */ void j0(long j) {
        this.zzb |= 4;
        this.zzj = j;
    }

    public final /* synthetic */ void j1(int i) {
        this.zze |= 1048576;
        this.zzak = i;
    }

    public final long j2() {
        return this.zzm;
    }

    public final /* synthetic */ void k0(long j) {
        this.zzb |= 8;
        this.zzk = j;
    }

    public final /* synthetic */ void k1(w1h w1hVar) {
        this.zzam = w1hVar;
        this.zze |= 4194304;
    }

    public final String k2() {
        return this.zzn;
    }

    public final /* synthetic */ void l0(long j) {
        this.zzb |= 16;
        this.zzl = j;
    }

    public final /* synthetic */ void l1(int i) {
        this.zze |= 8388608;
        this.zzan = i;
    }

    public final String l2() {
        return this.zzo;
    }

    public final /* synthetic */ void m0() {
        this.zzb &= -17;
        this.zzl = 0L;
    }

    public final /* synthetic */ void m1(o1h o1hVar) {
        this.zzao = o1hVar;
        this.zze |= 16777216;
    }

    public final String m2() {
        return this.zzp;
    }

    public final /* synthetic */ void n0(long j) {
        this.zzb |= 32;
        this.zzm = j;
    }

    public final /* synthetic */ void n1(m4h m4hVar) {
        this.zzaq = m4hVar;
        this.zze |= 67108864;
    }

    public final String n2() {
        return this.zzq;
    }

    public final /* synthetic */ void o0() {
        this.zzb &= -33;
        this.zzm = 0L;
    }

    public final /* synthetic */ void o1(long j) {
        this.zze |= 134217728;
        this.zzar = j;
    }

    public final boolean o2() {
        return (this.zzb & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0;
    }

    public final /* synthetic */ void p0() {
        this.zzb |= 64;
        this.zzn = "android";
    }

    public final /* synthetic */ void p1(n2h n2hVar) {
        this.zzat = n2hVar;
        this.zze |= 536870912;
    }

    public final int p2() {
        return this.zzr;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzaw, "\u0004E\u0000\u0002\u0001YE\u0000\u0006\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=Xဈ>Y\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", v2h.class, "zzh", p4h.class, "zzi", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzl", "zzE", "zzF", z1h.class, "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", llg.h, "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", gyg.class});
        }
        if (i2 == 3) {
            return new z3h();
        }
        if (i2 == 4) {
            return new u3h(zzaw);
        }
        if (i2 == 5) {
            return zzaw;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzax;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (z3h.class) {
            try {
                nmgVar = zzax;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzaw);
                    zzax = nmgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nmgVar;
    }

    public final /* synthetic */ void q0(String str) {
        str.getClass();
        this.zzb |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        this.zzo = str;
    }

    public final /* synthetic */ void q1(String str) {
        str.getClass();
        this.zze |= 1073741824;
        this.zzau = str;
    }

    public final String q2() {
        return this.zzs;
    }

    public final String r() {
        return this.zzt;
    }

    public final boolean r0() {
        return (this.zze & 2) != 0;
    }

    public final /* synthetic */ void r1() {
        String str = Build.MODEL;
        str.getClass();
        this.zzb |= 256;
        this.zzp = str;
    }

    public final String s() {
        return this.zzu;
    }

    public final int s0() {
        return this.zzP;
    }

    public final /* synthetic */ void s1() {
        this.zzb &= -257;
        this.zzp = zzaw.zzp;
    }

    public final boolean t() {
        return (this.zzb & 16384) != 0;
    }

    public final boolean t0() {
        return (this.zze & 16) != 0;
    }

    public final /* synthetic */ void t1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzq = str;
    }

    public final long u() {
        return this.zzv;
    }

    public final long u0() {
        return this.zzT;
    }

    public final /* synthetic */ void u1(int i) {
        this.zzb |= UserMetadata.MAX_ATTRIBUTE_SIZE;
        this.zzr = i;
    }

    public final boolean v() {
        return (this.zzb & 32768) != 0;
    }

    public final boolean v0() {
        return (this.zze & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
    }

    public final /* synthetic */ void v1(String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzs = str;
    }

    public final long w() {
        return this.zzw;
    }

    public final String w0() {
        return this.zzW;
    }

    public final /* synthetic */ void w1(String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzt = str;
    }

    public final String x() {
        return this.zzx;
    }

    public final boolean x0() {
        return (this.zze & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0;
    }

    public final /* synthetic */ void x1(String str) {
        str.getClass();
        this.zzb |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
        this.zzu = str;
    }

    public final boolean y() {
        return (this.zzb & 131072) != 0;
    }

    public final String y0() {
        return this.zzac;
    }

    public final /* synthetic */ void y1(long j) {
        this.zzb |= 16384;
        this.zzv = j;
    }

    public final boolean z() {
        return this.zzy;
    }

    public final boolean z0() {
        return (this.zze & 32768) != 0;
    }

    public final /* synthetic */ void z1() {
        this.zzb |= 32768;
        this.zzw = 161000L;
    }
}
