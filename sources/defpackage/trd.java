package defpackage;

import ai.askquin.R;
import ai.askquin.ui.draw.model.DrawCardSaves;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.filament.Engine;
import com.google.android.filament.SwapChain;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class trd implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ trd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        String str;
        yf1 yf1VarC;
        bxf bxfVar;
        int i = this.a;
        int i2 = 22;
        int i3 = 21;
        int i4 = 15;
        int i5 = 25;
        int i6 = 26;
        int i7 = 12;
        int i8 = 27;
        int i9 = 14;
        int i10 = 4;
        boolean z = true;
        z = true;
        c82 c82Var = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((sz9) obj2).k(((Integer) obj).intValue());
                return wef.a;
            case 1:
                ((tz9) obj2).k(((Long) obj).longValue());
                return wef.a;
            case 2:
                ((vz9) obj2).setValue(obj);
                return wef.a;
            case 3:
                nsd nsdVar = (nsd) obj2;
                synchronized (nsdVar.g) {
                    msd msdVar = nsdVar.i;
                    msdVar.getClass();
                    Object obj3 = msdVar.b;
                    obj3.getClass();
                    int i11 = msdVar.d;
                    e79 e79Var = msdVar.c;
                    if (e79Var == null) {
                        e79Var = new e79();
                        msdVar.c = e79Var;
                        msdVar.f.m(obj3, e79Var);
                    }
                    msdVar.b(obj, i11, obj3, e79Var);
                }
                return wef.a;
            case 4:
                DrawCardSaves drawCardSaves = (DrawCardSaves) obj;
                drawCardSaves.getClass();
                ((tr2) obj2).b(drawCardSaves);
                return wef.a;
            case 5:
                g0c g0cVar = (g0c) obj;
                a6e a6eVarQ1 = z5e.q1((z5e) obj2, 4);
                g0cVar.b(a6eVarQ1.v((byte) 21) ? a6eVarQ1.H : 1.0f);
                g0cVar.q(a6eVarQ1.v((byte) 22) ? a6eVarQ1.I : 1.0f);
                g0cVar.r(a6eVarQ1.v((byte) 23) ? a6eVarQ1.J : 1.0f);
                g0cVar.E(a6eVarQ1.v((byte) 24) ? a6eVarQ1.K : 0.0f);
                g0cVar.G(a6eVarQ1.v((byte) 25) ? a6eVarQ1.L : 0.0f);
                g0cVar.l(a6eVarQ1.v((byte) 26) ? a6eVarQ1.M : 0.0f);
                g0cVar.n(a6eVarQ1.v((byte) 27) ? a6eVarQ1.N : 0.0f);
                g0cVar.p(a6eVarQ1.v((byte) 28) ? a6eVarQ1.O : 0.0f);
                if (a6eVarQ1.w(54)) {
                    c82Var = a6eVarQ1.S;
                    c82Var.getClass();
                }
                g0cVar.h(c82Var);
                long jD = r2f.b;
                if (a6eVarQ1.v((byte) 29) || a6eVarQ1.v((byte) 30)) {
                    float fB = r2f.b(jD);
                    if (a6eVarQ1.v((byte) 29)) {
                        fB = a6eVarQ1.P;
                    }
                    float fC = r2f.c(jD);
                    if (a6eVarQ1.v((byte) 30)) {
                        fC = a6eVarQ1.Q;
                    }
                    jD = sfc.d(fB, fC);
                }
                g0cVar.D(jD);
                g0cVar.g(a6eVarQ1.v((byte) 31) ? a6eVarQ1.D : false);
                x4d x4dVar = g21.f;
                if (a6eVarQ1.w(53)) {
                    x4dVar = a6eVarQ1.E;
                }
                g0cVar.w(x4dVar);
                return wef.a;
            case 6:
                ((sw3) obj).getClass();
                return new w67(((long) ym8.L(((mo) obj2).e())) << 32);
            case 7:
                waf wafVar = (waf) obj2;
                Context context = (Context) obj;
                context.getClass();
                TextureView textureView = new TextureView(context);
                TextureView textureView2 = wafVar.a;
                if (textureView2 == null) {
                    wafVar.a = textureView;
                    textureView.setOpaque(wafVar.d);
                    wafVar.c = new vaf(wafVar, textureView);
                } else if (textureView2 != textureView) {
                    vaf vafVar = wafVar.c;
                    if (vafVar != null) {
                        vafVar.a.setSurfaceTextureListener(null);
                        wafVar.c = null;
                    }
                    g5b g5bVar = wafVar.b;
                    if (g5bVar != null) {
                        lge lgeVar = (lge) g5bVar.b;
                        Engine engine = lgeVar.b;
                        SwapChain swapChain = lgeVar.n;
                        if (swapChain != null) {
                            engine.s(swapChain);
                            engine.w();
                        }
                        lgeVar.n = null;
                    }
                    wafVar.a = textureView;
                    textureView.setOpaque(wafVar.d);
                    wafVar.c = new vaf(wafVar, textureView);
                }
                return textureView;
            case 8:
                yx4 yx4Var = (yx4) obj2;
                t09 t09Var = (t09) obj;
                t09Var.getClass();
                kob kobVar = job.a;
                oa7.q(t09Var, kobVar.b(tgb.class), null, new mle(yx4Var, 11));
                oa7.q(t09Var, kobVar.b(d56.class), null, new mle(yx4Var, 3));
                oa7.q(t09Var, kobVar.b(kb7.class), null, new mle(yx4Var, 6));
                oa7.q(t09Var, kobVar.b(ilb.class), null, new mle(yx4Var, 7));
                oa7.q(t09Var, kobVar.b(r76.class), null, new mle(yx4Var, 8));
                oa7.q(t09Var, kobVar.b(mf6.class), null, new mle(yx4Var, 9));
                oa7.q(t09Var, kobVar.b(az4.class), null, new mle(yx4Var, 10));
                oa7.q(t09Var, kobVar.b(vkf.class), null, new mle(yx4Var, i7));
                oa7.q(t09Var, kobVar.b(n4b.class), null, new mle(yx4Var, 13));
                oa7.q(t09Var, kobVar.b(z23.class), null, new mle(yx4Var, i9));
                oa7.q(t09Var, kobVar.b(n10.class), null, new mle(yx4Var, i4));
                oa7.q(t09Var, kobVar.b(pic.class), null, new mle(yx4Var, 16));
                oa7.q(t09Var, kobVar.b(pt8.class), null, new mle(yx4Var, 17));
                oa7.q(t09Var, kobVar.b(n2g.class), null, new mle(yx4Var, 18));
                oa7.q(t09Var, kobVar.b(w1g.class), null, new mle(yx4Var, 19));
                oa7.q(t09Var, kobVar.b(lfe.class), null, new mle(yx4Var, 20));
                oa7.q(t09Var, kobVar.b(vab.class), null, new mle(yx4Var, i3));
                oa7.q(t09Var, kobVar.b(xie.class), null, new mle(yx4Var, i2));
                oa7.q(t09Var, kobVar.b(wie.class), null, new mle(yx4Var, z ? 1 : 0));
                oa7.q(t09Var, kobVar.b(ije.class), null, new mle(yx4Var, 2));
                oa7.q(t09Var, kobVar.b(vq1.class), null, new mle(yx4Var, i10));
                oa7.q(t09Var, kobVar.b(maa.class), null, new mle(yx4Var, 5));
                return wef.a;
            case 9:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("more_questions", "btn");
                bme bmeVar = ((fme) obj2).f;
                if (bmeVar instanceof yle) {
                    switch (cme.a[((yle) bmeVar).a.ordinal()]) {
                        case 1:
                            str = "general";
                            break;
                        case 2:
                            str = "luck";
                            break;
                        case 3:
                            str = "career";
                            break;
                        case 4:
                            str = "growing";
                            break;
                        case 5:
                            str = "relationship";
                            break;
                        case 6:
                            str = "pet";
                            break;
                        case 7:
                            str = "unknown";
                            break;
                        default:
                            ap.c();
                            return null;
                    }
                } else if (bmeVar instanceof ame) {
                    str = ((ame) bmeVar).b;
                    if (str == null) {
                        str = "provided";
                    }
                } else {
                    if (!(bmeVar instanceof zle)) {
                        ap.c();
                        return null;
                    }
                    str = ((zle) bmeVar).a;
                    if (str == null) {
                        str = "scene";
                    }
                }
                l1fVar.a(str, "pathway");
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Drawable drawable = (Drawable) obj2;
                sn4 sn4Var = (sn4) obj;
                vl1 vl1VarP = sn4Var.v0().p();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (sn4Var.f() >> 32)), (int) Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)));
                drawable.draw(mp.b(vl1VarP));
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((a26) obj).d((rme) obj2);
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                eoe eoeVar = (eoe) obj2;
                bv7 bv7Var = (bv7) obj;
                hkb hkbVar = (hkb) eoeVar.J0.x.getValue();
                if (hkbVar == null) {
                    hkbVar = hkb.e;
                }
                bv7 bv7VarE = eoeVar.H0.e();
                if (bv7VarE != null) {
                    return vd0.A0(hkbVar, bv7VarE, bv7Var);
                }
                l37.d("Required value was null.");
                oo3.f();
                return null;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ClipDescription clipDescription = ((fj4) obj).a.getClipDescription();
                Iterable<pq8> iterable = (Iterable) ((koe) obj2).invoke();
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    z = false;
                } else {
                    for (pq8 pq8Var : iterable) {
                        if (pa7.t(pq8Var, pq8.c) || (clipDescription != null && clipDescription.hasMimeType(pq8Var.a))) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                pqe pqeVar = (pqe) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                qz9 qz9Var = pqeVar.a;
                float fJ = qz9Var.j() + fFloatValue;
                qz9 qz9Var2 = pqeVar.b;
                if (fJ > qz9Var2.j()) {
                    fFloatValue = qz9Var2.j() - qz9Var.j();
                } else if (fJ < 0.0f) {
                    fFloatValue = -qz9Var.j();
                }
                qz9Var.k(qz9Var.j() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 15:
                zte zteVar = (zte) obj2;
                j00 j00Var = (j00) obj;
                g00 g00Var = (g00) j00Var.a;
                if (g00Var instanceof k68) {
                    k68 k68Var = (k68) g00Var;
                    if (k68Var.b == null) {
                        return j00.a(j00Var, new k68(k68Var.a, zteVar), 0, 0, 14);
                    }
                }
                if (!(g00Var instanceof j68)) {
                    return j00Var;
                }
                j68 j68Var = (j68) g00Var;
                return j68Var.b == null ? j00.a(j00Var, new j68(j68Var.a, zteVar), 0, 0, 14) : j00Var;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((s0f) obj2).j = null;
                return wef.a;
            case 17:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                String str2 = (String) ((ua9) obj2).b.f;
                if (str2 == null) {
                    str2 = "";
                }
                l1fVar2.a(str2, "screen_name");
                return wef.a;
            case 18:
                l1f l1fVar3 = (l1f) obj;
                l1fVar3.getClass();
                ((LinkedHashMap) obj2).forEach(new al(new v5c(2, l1fVar3, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 10), i9));
                return wef.a;
            case 19:
                l1f l1fVar4 = (l1f) obj;
                l1fVar4.getClass();
                ((s7a) obj2).b.forEach(new al(new v5c(2, l1fVar4, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 9), i4));
                return wef.a;
            case 20:
                return new lf(i5, (n3f) obj2);
            case 21:
                return new lf(i6, (p3f) obj2);
            case 22:
                n5f n5fVar = (n5f) obj2;
                q22 q22Var = (q22) obj;
                q22Var.getClass();
                q22Var.a("first", n5fVar.a.e(), (12 & 8) == 0);
                q22Var.a("second", n5fVar.b.e(), (12 & 8) == 0);
                q22Var.a("third", n5fVar.c.e(), (12 & 8) == 0);
                return wef.a;
            case 23:
                rcf rcfVar = (rcf) obj2;
                ((ra4) obj).getClass();
                Object obj4 = new Object();
                AtomicReference atomicReference = i3b.a;
                i3b.a.set(new h3b(obj4, new yv9(0, rcfVar, rcf.class, "pushBadCardForQa", "pushBadCardForQa()Lai/askquin/ui/draw/BadCardDrawResult;", 0, 24)));
                return new jt2(i10, obj4);
            case 24:
                g0c g0cVar2 = (g0c) obj;
                g0cVar2.getClass();
                float f = ((qad) obj2).a;
                g0cVar2.q(f);
                g0cVar2.r(f);
                g0cVar2.D(sfc.d(0.0f, 0.0f));
                return wef.a;
            case 25:
                im2 im2Var = (im2) obj;
                im2Var.getClass();
                vv7 vv7Var = (vv7) im2Var;
                xl1 xl1Var = vv7Var.a;
                vl1 vl1VarP2 = xl1Var.b.p();
                vl1VarP2.l(z5c.g(0L, xl1Var.f()), (rt) obj2);
                vv7Var.a();
                vl1VarP2.o();
                return wef.a;
            case 26:
                uf1 uf1Var = (uf1) obj;
                uf1Var.getClass();
                hh1 hh1Var = ((ekf) obj2).a;
                synchronized (hh1Var.c) {
                    if (hh1Var.d) {
                        throw new IllegalStateException("Check failed.");
                    }
                    StringBuilder sb = new StringBuilder("CameraGraph-");
                    wh0 wh0Var = bg1.b;
                    wh0Var.getClass();
                    sb.append(wh0.b.incrementAndGet(wh0Var));
                    yf1VarC = hh1Var.c(uf1Var, new bg1(sb.toString()));
                }
                return yf1VarC;
            case 27:
                ((Surface) obj).release();
                ((SurfaceTexture) ((bxf) obj2).d).release();
                return wef.a;
            case 28:
                dxf dxfVar = (dxf) obj2;
                cxf cxfVar = (cxf) obj;
                TextureView.SurfaceTextureListener surfaceTextureListener = cxfVar.getSurfaceTextureListener();
                if ((surfaceTextureListener instanceof dxf ? (dxf) surfaceTextureListener : null) != null && (bxfVar = dxfVar.e) != null && !bxfVar.c) {
                    bxfVar.b.c();
                    bxfVar.c = true;
                }
                cxfVar.setSurfaceTextureListener(null);
                return wef.a;
            default:
                o8b o8bVar = (o8b) obj2;
                ((ra4) obj).getClass();
                bp3 bp3Var = (bp3) o8bVar;
                if (bp3Var.b()) {
                    bp3Var.j();
                    bp3Var.f = null;
                    Uri uriBuildRawResourceUri = kdb.buildRawResourceUri(R.raw.quin_pronunciation);
                    uriBuildRawResourceUri.getClass();
                    y45 y45Var = bp3Var.b;
                    if (y45Var != null) {
                        int i12 = op8.g;
                        d82 d82Var = new d82();
                        ey6 ey6Var = jy6.b;
                        yob yobVar = yob.e;
                        List list = Collections.EMPTY_LIST;
                        ey6 ey6Var2 = jy6.b;
                        y45Var.M(new op8("", new ip8(d82Var), new lp8(uriBuildRawResourceUri, null, null, list, yob.e, -9223372036854775807L), new kp8(new jp8()), rp8.C, mp8.a));
                        y45Var.D();
                    }
                }
                return new lf(i8, o8bVar);
        }
    }
}
