package defpackage;

import android.os.Build;
import android.util.Log;
import io.sentry.android.core.b1;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class iqb implements d4d {
    public static final int g;
    public static final rob h;
    public final yxe a;
    public final of5 b;
    public final xb0 c;
    public final kqb d;
    public final w3d e;
    public final f99 f;

    static {
        qfc qfcVar = ar4.b;
        g = (int) ar4.h(y41.T(24, gr4.HOURS), gr4.SECONDS);
        h = new rob("com/google/firebase/sessions//");
    }

    public iqb(yxe yxeVar, of5 of5Var, xb0 xb0Var, kqb kqbVar, w3d w3dVar) {
        yxeVar.getClass();
        of5Var.getClass();
        xb0Var.getClass();
        kqbVar.getClass();
        w3dVar.getClass();
        this.a = yxeVar;
        this.b = of5Var;
        this.c = xb0Var;
        this.d = kqbVar;
        this.e = w3dVar;
        this.f = new f99();
    }

    @Override // defpackage.d4d
    public final Boolean a() {
        return this.e.a().a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b0 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:45:0x00a6, B:47:0x00b0, B:50:0x00b9), top: B:63:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9 A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:45:0x00a6, B:47:0x00b0, B:50:0x00b9), top: B:63:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:53:0x013f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0143  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00b9, please report this as an issue */
    @Override // defpackage.d4d
    public final Object b(xn2 xn2Var) throws Throwable {
        fqb fqbVar;
        d99 d99Var;
        d99 d99Var2;
        d99 d99Var3;
        String str;
        Object objP0;
        d99 d99Var4;
        if (xn2Var instanceof fqb) {
            fqbVar = (fqb) xn2Var;
            int i = fqbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fqbVar.label = i - Integer.MIN_VALUE;
            } else {
                fqbVar = new fqb(this, (zn2) xn2Var);
            }
        } else {
            fqbVar = new fqb(this, (zn2) xn2Var);
        }
        Object obj = fqbVar.result;
        int i2 = fqbVar.label;
        w3d w3dVar = this.e;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                f99 f99Var = this.f;
                if (!f99Var.e() && !w3dVar.b()) {
                    return wefVar;
                }
                fqbVar.L$0 = f99Var;
                fqbVar.label = 1;
                Object objB = f99Var.b(fqbVar);
                d99Var = f99Var;
                if (objB != bw2Var) {
                }
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    d99 d99Var5 = (d99) fqbVar.L$0;
                    try {
                        jzb.q(obj);
                        d99Var3 = d99Var5;
                        str = ((s57) obj).a;
                        if (str.equals("")) {
                            b1.l("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            d99Var3.h(null);
                            return wefVar;
                        }
                        iy9 iy9Var = new iy9("X-Crashlytics-Installation-ID", str);
                        String str2 = Build.MANUFACTURER + Build.MODEL;
                        rob robVar = h;
                        iy9 iy9Var2 = new iy9("X-Crashlytics-Device-Model", robVar.h(str2, ""));
                        String str3 = Build.VERSION.INCREMENTAL;
                        str3.getClass();
                        iy9 iy9Var3 = new iy9("X-Crashlytics-OS-Build-Version", robVar.h(str3, ""));
                        String str4 = Build.VERSION.RELEASE;
                        str4.getClass();
                        iy9 iy9Var4 = new iy9("X-Crashlytics-OS-Display-Version", robVar.h(str4, ""));
                        this.c.getClass();
                        Map mapH = bm8.H(iy9Var, iy9Var2, iy9Var3, iy9Var4, new iy9("X-Crashlytics-API-Client-Version", "3.0.7"));
                        Log.d("FirebaseSessions", "Fetching settings from server.");
                        kqb kqbVar = this.d;
                        gqb gqbVar = new gqb(this, null);
                        hqb hqbVar = new hqb(2, null);
                        fqbVar.L$0 = d99Var3;
                        fqbVar.label = 3;
                        objP0 = ynb.p0(kqbVar.b, new jqb(kqbVar, mapH, gqbVar, hqbVar, null), fqbVar);
                        if (objP0 != bw2Var) {
                            objP0 = wefVar;
                        }
                        if (objP0 != bw2Var) {
                            d99Var4 = d99Var3;
                            d99Var4.h(null);
                            return wefVar;
                        }
                        return bw2Var;
                    } catch (Throwable th) {
                        th = th;
                        d99Var2 = d99Var5;
                    }
                } else {
                    if (i2 != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d99Var2 = (d99) fqbVar.L$0;
                    try {
                        jzb.q(obj);
                        d99Var4 = d99Var2;
                        d99Var4.h(null);
                        return wefVar;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                d99Var2.h(null);
                throw th;
            }
            d99 d99Var6 = (d99) fqbVar.L$0;
            jzb.q(obj);
            d99Var = d99Var6;
            if (!w3dVar.b()) {
                Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                d99Var.h(null);
                return wefVar;
            }
            r57 r57Var = s57.c;
            of5 of5Var = this.b;
            fqbVar.L$0 = d99Var;
            fqbVar.label = 2;
            Object objA = r57Var.a(of5Var, fqbVar);
            if (objA != bw2Var) {
                d99Var3 = d99Var;
                obj = objA;
                str = ((s57) obj).a;
                if (str.equals("")) {
                    b1.l("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    d99Var3.h(null);
                    return wefVar;
                }
                iy9 iy9Var5 = new iy9("X-Crashlytics-Installation-ID", str);
                String str5 = Build.MANUFACTURER + Build.MODEL;
                rob robVar2 = h;
                iy9 iy9Var6 = new iy9("X-Crashlytics-Device-Model", robVar2.h(str5, ""));
                String str6 = Build.VERSION.INCREMENTAL;
                str6.getClass();
                iy9 iy9Var7 = new iy9("X-Crashlytics-OS-Build-Version", robVar2.h(str6, ""));
                String str7 = Build.VERSION.RELEASE;
                str7.getClass();
                iy9 iy9Var8 = new iy9("X-Crashlytics-OS-Display-Version", robVar2.h(str7, ""));
                this.c.getClass();
                Map mapH2 = bm8.H(iy9Var5, iy9Var6, iy9Var7, iy9Var8, new iy9("X-Crashlytics-API-Client-Version", "3.0.7"));
                Log.d("FirebaseSessions", "Fetching settings from server.");
                kqb kqbVar2 = this.d;
                gqb gqbVar2 = new gqb(this, null);
                hqb hqbVar2 = new hqb(2, null);
                fqbVar.L$0 = d99Var3;
                fqbVar.label = 3;
                objP0 = ynb.p0(kqbVar2.b, new jqb(kqbVar2, mapH2, gqbVar2, hqbVar2, null), fqbVar);
                if (objP0 != bw2Var) {
                    objP0 = wefVar;
                }
                if (objP0 != bw2Var) {
                    d99Var4 = d99Var3;
                    d99Var4.h(null);
                    return wefVar;
                }
            }
            return bw2Var;
        } catch (Throwable th3) {
            th = th3;
            d99Var2 = d99Var;
        }
    }

    @Override // defpackage.d4d
    public final ar4 c() {
        Integer num = this.e.a().c;
        if (num == null) {
            return null;
        }
        qfc qfcVar = ar4.b;
        return new ar4(y41.T(num.intValue(), gr4.SECONDS));
    }

    @Override // defpackage.d4d
    public final Double d() {
        return this.e.a().b;
    }
}
