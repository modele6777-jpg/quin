package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Trace;
import android.renderscript.RenderScript;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zqb implements p01 {
    public static boolean h = true;
    public final xh6 a;
    public final RenderScript b;
    public crb c;
    public final xl1 d = new xl1();
    public lyd e;
    public boolean f;
    public final ke6 g;

    public zqb(xh6 xh6Var) {
        this.a = xh6Var;
        this.b = RenderScript.create((Context) eb3.H(xh6Var, uq.b));
        this.g = ((ie6) eb3.H(xh6Var, zg2.g)).c();
    }

    @Override // defpackage.p01
    public final void a(vv7 vv7Var) {
        xh6 xh6Var;
        lyd lydVar;
        pr4 pr4Var = uq.b;
        xh6 xh6Var2 = this.a;
        Context context = (Context) eb3.H(xh6Var2, pr4Var);
        long j = xh6Var2.Q0;
        jmb jmbVar = new jmb();
        float fA = zh6.a(xh6Var2);
        jmbVar.element = fA;
        jmb jmbVar2 = new jmb();
        vv7Var.getDensity();
        float fP0 = vv7Var.p0(zh6.d(xh6Var2)) * fA;
        jmbVar2.element = fP0;
        if (fP0 > 25.0f) {
            jmbVar.element = (25.0f / fP0) * jmbVar.element;
            jmbVar2.element = 25.0f;
        }
        ke6 ke6Var = this.g;
        if (e77.b(ke6Var.u, 0L) || (lydVar = this.e) == null || !lydVar.b()) {
            this.f = false;
            ke6 ke6VarF = eb3.F(vv7Var, xh6Var2, jmbVar.element, xh6Var2.P0, j);
            xh6Var = xh6Var2;
            if (ke6VarF != null) {
                ke6VarF.g(xh6Var.d1 != null);
                if (e77.b(ke6Var.u, 0L)) {
                    bm8.P(new vqb(this, ke6VarF, jmbVar2, null));
                } else {
                    aw2 aw2VarZ0 = xh6Var.Z0();
                    js3 js3Var = ga4.a;
                    this.e = ynb.V(aw2VarZ0, mk8.a.f, null, new wqb(this, ke6VarF, jmbVar2, null), 2);
                }
            }
        } else {
            this.f = true;
            xh6Var = xh6Var2;
        }
        tm7.R(xh6Var, new uqb(this, vv7Var, j, jmbVar, context));
    }

    @Override // defpackage.p01
    public final void b() {
        lyd lydVar = this.e;
        if (lydVar != null) {
            lydVar.h(null);
        }
        ((ie6) eb3.H(this.a, zg2.g)).a(this.g);
        crb crbVar = this.c;
        if (crbVar != null) {
            crbVar.h = true;
            crbVar.c.destroy();
            crbVar.d.destroy();
            crbVar.e.destroy();
            crbVar.a.destroy();
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0151  */
    /* JADX WARN: Code duplicated, block: B:51:0x0155  */
    /* JADX WARN: Code duplicated, block: B:53:0x015a A[Catch: all -> 0x01f7, TRY_LEAVE, TryCatch #11 {all -> 0x01f7, blocks: (B:48:0x014a, B:53:0x015a, B:77:0x01fb), top: B:119:0x014a }] */
    /* JADX WARN: Code duplicated, block: B:59:0x019d  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object c(ke6 ke6Var, float f, zn2 zn2Var) throws Throwable {
        xqb xqbVar;
        String str;
        int i;
        int i2;
        String str2;
        String str3;
        int i3;
        float f2;
        crb crbVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String str4;
        js3 js3Var;
        yqb yqbVar;
        crb crbVar2;
        ke6 ke6Var2 = ke6Var;
        if (zn2Var instanceof xqb) {
            xqbVar = (xqb) zn2Var;
            int i11 = xqbVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xqbVar.label = i11 - Integer.MIN_VALUE;
            } else {
                xqbVar = new xqb(this, zn2Var);
            }
        } else {
            xqbVar = new xqb(this, zn2Var);
        }
        Object obj = xqbVar.result;
        int i12 = xqbVar.label;
        wef wefVar = wef.a;
        xh6 xh6Var = this.a;
        String str5 = null;
        bw2 bw2Var = bw2.a;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i10 = xqbVar.I$7;
                    int i13 = xqbVar.I$2;
                    str4 = (String) xqbVar.L$7;
                    crbVar2 = (crb) xqbVar.L$4;
                    str5 = (String) xqbVar.L$2;
                    try {
                        jzb.q(obj);
                        i = i13;
                        xdc.l(i10, str4);
                        Trace.beginSection(xdc.v("Haze-RenderScriptBlurEffect-updateSurface-drawToContentLayer"));
                        try {
                            Bitmap bitmap = crbVar2.f;
                            this.g.e(vd0.s0(xh6Var).O0, (cv7) eb3.H(xh6Var, zg2.n), (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L), new ymb(1, bitmap));
                            Trace.endSection();
                            str = str5;
                            xdc.l(i, str);
                            return wefVar;
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        xdc.l(i10, str4);
                        throw th;
                    }
                }
                int i14 = xqbVar.I$7;
                int i15 = xqbVar.I$4;
                i6 = xqbVar.I$3;
                i = xqbVar.I$2;
                i7 = xqbVar.I$1;
                i8 = xqbVar.I$0;
                float f3 = xqbVar.F$0;
                str2 = (String) xqbVar.L$7;
                crbVar = (crb) xqbVar.L$4;
                str = (String) xqbVar.L$2;
                ke6Var2 = (ke6) xqbVar.L$0;
                try {
                    jzb.q(obj);
                    i5 = i15;
                    f2 = f3;
                    i4 = i14;
                    try {
                        xdc.l(i4, str2);
                        if (!xh6Var.Y) {
                            wefVar = wefVar;
                        } else if (f2 > 0.0f) {
                            xdc.f(0, "Haze-RenderScriptBlurEffect-updateSurface-applyBlur");
                            try {
                                js3Var = ga4.a;
                                yqbVar = new yqb(crbVar, f2, null);
                                xqbVar.L$0 = null;
                                xqbVar.L$1 = null;
                                xqbVar.L$2 = str;
                                xqbVar.L$3 = null;
                                xqbVar.L$4 = crbVar;
                                xqbVar.L$5 = null;
                                xqbVar.L$6 = null;
                                xqbVar.L$7 = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                xqbVar.L$8 = null;
                                xqbVar.F$0 = f2;
                                xqbVar.I$0 = i8;
                                xqbVar.I$1 = i7;
                                xqbVar.I$2 = i;
                                xqbVar.I$3 = i6;
                                xqbVar.I$4 = i5;
                                i9 = 0;
                                try {
                                    xqbVar.I$5 = 0;
                                    xqbVar.I$6 = 0;
                                    xqbVar.I$7 = 0;
                                    xqbVar.I$8 = 0;
                                    xqbVar.I$9 = 0;
                                    xqbVar.label = 2;
                                    if (ynb.p0(js3Var, yqbVar, xqbVar) != bw2Var) {
                                        crbVar2 = crbVar;
                                        str5 = str;
                                        i10 = 0;
                                        str4 = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                        xdc.l(i10, str4);
                                        Trace.beginSection(xdc.v("Haze-RenderScriptBlurEffect-updateSurface-drawToContentLayer"));
                                        Bitmap bitmap2 = crbVar2.f;
                                        this.g.e(vd0.s0(xh6Var).O0, (cv7) eb3.H(xh6Var, zg2.n), (((long) bitmap2.getWidth()) << 32) | (((long) bitmap2.getHeight()) & 4294967295L), new ymb(1, bitmap2));
                                        Trace.endSection();
                                        str = str5;
                                    }
                                    return bw2Var;
                                } catch (Throwable th3) {
                                    th = th3;
                                    i10 = i9;
                                    str4 = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                    xdc.l(i10, str4);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                i9 = 0;
                            }
                        } else {
                            wefVar = wefVar;
                            this.g.e(vd0.s0(xh6Var).O0, (cv7) eb3.H(xh6Var, zg2.n), ke6Var2.u, new ymb(2, ke6Var2));
                        }
                        xdc.l(i, str);
                        return wefVar;
                    } catch (Throwable th5) {
                        th = th5;
                        xdc.l(i, str);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    str3 = str;
                    i2 = i;
                    i3 = i14;
                    try {
                        xdc.l(i3, str2);
                        throw th;
                    } catch (Throwable th7) {
                        th = th7;
                        str = str3;
                        i = i2;
                        xdc.l(i, str);
                        throw th;
                    }
                }
            }
            jzb.q(obj);
            str = "Haze-RenderScriptBlurEffect-updateSurface";
            xdc.f(0, "Haze-RenderScriptBlurEffect-updateSurface");
            try {
                long j = ke6Var2.u;
                try {
                    crb crbVar3 = this.c;
                    if (crbVar3 == null || !e77.b(crbVar3.b, j)) {
                        if (crbVar3 != null) {
                            crbVar3.h = true;
                            crbVar3.c.destroy();
                            crbVar3.d.destroy();
                            crbVar3.e.destroy();
                            crbVar3.a.destroy();
                        }
                        RenderScript renderScript = this.b;
                        renderScript.getClass();
                        crbVar3 = new crb(renderScript, j);
                        this.c = crbVar3;
                    }
                    str2 = "Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface";
                    i2 = 0;
                    try {
                        xdc.f(0, "Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface");
                        try {
                            Surface surface = crbVar3.d.getSurface();
                            surface.getClass();
                            arb.h(surface, ke6Var2, vd0.s0(xh6Var).O0, this.d);
                            xqbVar.L$0 = ke6Var2;
                            xqbVar.L$1 = null;
                            xqbVar.L$2 = "Haze-RenderScriptBlurEffect-updateSurface";
                            xqbVar.L$3 = null;
                            xqbVar.L$4 = crbVar3;
                            xqbVar.L$5 = null;
                            xqbVar.L$6 = null;
                            xqbVar.L$7 = "Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface";
                            xqbVar.L$8 = null;
                            f2 = f;
                            xqbVar.F$0 = f2;
                            try {
                                xqbVar.I$0 = 0;
                                xqbVar.I$1 = 0;
                                xqbVar.I$2 = 0;
                                xqbVar.I$3 = 0;
                                xqbVar.I$4 = 0;
                                xqbVar.I$5 = 0;
                                xqbVar.I$6 = 0;
                                xqbVar.I$7 = 0;
                                xqbVar.I$8 = 0;
                                xqbVar.I$9 = 0;
                                xqbVar.label = 1;
                                Object objM = crbVar3.g.m(xqbVar);
                                if (objM != bw2Var) {
                                    objM = wefVar;
                                }
                                if (objM != bw2Var) {
                                    crbVar = crbVar3;
                                    i4 = 0;
                                    i5 = 0;
                                    i6 = 0;
                                    i = 0;
                                    i7 = 0;
                                    i8 = 0;
                                    xdc.l(i4, str2);
                                    if (!xh6Var.Y) {
                                        wefVar = wefVar;
                                    } else if (f2 > 0.0f) {
                                        xdc.f(0, "Haze-RenderScriptBlurEffect-updateSurface-applyBlur");
                                        js3Var = ga4.a;
                                        yqbVar = new yqb(crbVar, f2, null);
                                        xqbVar.L$0 = null;
                                        xqbVar.L$1 = null;
                                        xqbVar.L$2 = str;
                                        xqbVar.L$3 = null;
                                        xqbVar.L$4 = crbVar;
                                        xqbVar.L$5 = null;
                                        xqbVar.L$6 = null;
                                        xqbVar.L$7 = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                        xqbVar.L$8 = null;
                                        xqbVar.F$0 = f2;
                                        xqbVar.I$0 = i8;
                                        xqbVar.I$1 = i7;
                                        xqbVar.I$2 = i;
                                        xqbVar.I$3 = i6;
                                        xqbVar.I$4 = i5;
                                        i9 = 0;
                                        xqbVar.I$5 = 0;
                                        xqbVar.I$6 = 0;
                                        xqbVar.I$7 = 0;
                                        xqbVar.I$8 = 0;
                                        xqbVar.I$9 = 0;
                                        xqbVar.label = 2;
                                        if (ynb.p0(js3Var, yqbVar, xqbVar) != bw2Var) {
                                            crbVar2 = crbVar;
                                            str5 = str;
                                            i10 = 0;
                                            str4 = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                            xdc.l(i10, str4);
                                            Trace.beginSection(xdc.v("Haze-RenderScriptBlurEffect-updateSurface-drawToContentLayer"));
                                            Bitmap bitmap3 = crbVar2.f;
                                            this.g.e(vd0.s0(xh6Var).O0, (cv7) eb3.H(xh6Var, zg2.n), (((long) bitmap3.getWidth()) << 32) | (((long) bitmap3.getHeight()) & 4294967295L), new ymb(1, bitmap3));
                                            Trace.endSection();
                                            str = str5;
                                        }
                                    } else {
                                        wefVar = wefVar;
                                        this.g.e(vd0.s0(xh6Var).O0, (cv7) eb3.H(xh6Var, zg2.n), ke6Var2.u, new ymb(2, ke6Var2));
                                    }
                                    xdc.l(i, str);
                                    return wefVar;
                                }
                                return bw2Var;
                            } catch (Throwable th8) {
                                th = th8;
                                i2 = 0;
                                str3 = "Haze-RenderScriptBlurEffect-updateSurface";
                                i3 = i2;
                                xdc.l(i3, str2);
                                throw th;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            i2 = 0;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        i = i2;
                        xdc.l(i, str);
                        throw th;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    i2 = 0;
                    i = i2;
                    xdc.l(i, str);
                    throw th;
                }
            } catch (Throwable th12) {
                th = th12;
            }
        } catch (Throwable th13) {
            th = th13;
            str = str5;
        }
    }
}
