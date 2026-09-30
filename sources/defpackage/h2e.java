package defpackage;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.inputmethod.BaseInputConnection;
import androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.node.LayoutNode;
import androidx.work.impl.WorkDatabase;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h2e implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h2e(sug sugVar, nh1 nh1Var) {
        this.a = 12;
        this.b = nh1Var;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0345 A[PHI: r6 r7
  0x0345: PHI (r6v6 int) = (r6v5 int), (r6v5 int), (r6v11 int), (r6v11 int) binds: [B:136:0x02de, B:137:0x02e0, B:157:0x032b, B:160:0x0337] A[DONT_GENERATE, DONT_INLINE]
  0x0345: PHI (r7v5 int) = (r7v4 int), (r7v4 int), (r7v8 int), (r7v8 int) binds: [B:136:0x02de, B:137:0x02e0, B:157:0x032b, B:160:0x0337] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:164:0x034b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0359  */
    /* JADX WARN: Code duplicated, block: B:168:0x0369  */
    /* JADX WARN: Code duplicated, block: B:170:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:171:0x03ad  */
    @Override // defpackage.x16
    public final Object invoke() throws Throwable {
        Throwable th;
        k47 k47VarA;
        float f;
        float f2;
        aac aacVar;
        aac aacVar2;
        String str;
        float fMax;
        tpe tpeVar;
        int i = this.a;
        boolean z = false;
        wef wefVar = wef.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                q7d q7dVar = ((s7d) obj).a;
                if (q7dVar != null) {
                    bo8 bo8Var = q7dVar.a;
                    return new e77(d8d.b(bo8Var.b, bo8Var.a));
                }
                qc0.p("Required value was null.");
                return null;
            case 1:
                z5e z5eVar = (z5e) obj;
                ke6 ke6Var = z5eVar.K0;
                if (ke6Var != null) {
                    return ke6Var;
                }
                ke6 ke6VarC = vd0.q0(z5eVar).c();
                z5eVar.K0 = ke6VarC;
                return ke6VarC;
            case 2:
                gw7 gw7VarA = ((q6e) obj).a();
                LayoutNode layoutNode = gw7VarA.a;
                if (gw7VarA.Y != ((p89) ((g79) layoutNode.q()).b).c) {
                    w79 w79Var = gw7VarA.f;
                    Object[] objArr = w79Var.c;
                    long[] jArr = w79Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        ((zv7) objArr[(i2 << 3) + i4]).d = true;
                                    }
                                    j >>= 8;
                                }
                                if (i3 == 8) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                    if (layoutNode.w != null) {
                        if (!layoutNode.x()) {
                            LayoutNode.s0(layoutNode, false, 7);
                        }
                    } else if (!layoutNode.A()) {
                        LayoutNode.u0(layoutNode, false, 7);
                    }
                }
                return wefVar;
            case 3:
                rbe rbeVar = (rbe) obj;
                ax6 ax6Var = rbeVar.a;
                as9 as9Var = rbeVar.b;
                v41 v41VarP0 = ax6Var.P0();
                try {
                    k47VarA = pbe.a.a(v41VarP0);
                    try {
                        v41VarP0.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        v41VarP0.close();
                    } catch (Throwable th4) {
                        bzd.m(th3, th4);
                    }
                    th = th3;
                    k47VarA = null;
                    break;
                }
                if (th != null) {
                    throw th;
                }
                gg7 gg7Var = (gg7) k47VarA.b;
                aac aacVar3 = (aac) gg7Var.b;
                if (aacVar3 != null) {
                    v79 v79Var = aacVar3.o;
                    RectF rectF = v79Var == null ? null : new RectF(v79Var.b, v79Var.c, v79Var.c(), v79Var.d());
                    qbe qbeVar = rectF != null ? new qbe(rectF.left, rectF.top, rectF.right, rectF.bottom) : null;
                    if (qbeVar != null) {
                        f = qbeVar.c - qbeVar.a;
                        f2 = qbeVar.d - qbeVar.b;
                    } else if (((aac) gg7Var.b) != null) {
                        f = gg7Var.g().d;
                        if (((aac) gg7Var.b) != null) {
                            f2 = gg7Var.g().e;
                        } else {
                            qc0.j("SVG document is empty");
                        }
                    } else {
                        qc0.j("SVG document is empty");
                    }
                    ykd ykdVar = as9Var.b;
                    zdc zdcVar = as9Var.c;
                    if (pa7.t(ykdVar, ykd.c)) {
                        float fFloatValue = ((Number) rbeVar.c.d(as9Var.a)).floatValue();
                        if (f > 0.0f) {
                            f *= fFloatValue;
                        }
                        if (f2 > 0.0f) {
                            f2 *= fFloatValue;
                        }
                    }
                    int iL = f > 0.0f ? ym8.L(f) : 512;
                    int iL2 = f2 > 0.0f ? ym8.L(f2) : 512;
                    ykd ykdVar2 = as9Var.b;
                    q95 q95Var = vw6.b;
                    long jQ = y7h.q(iL, iL2, ykdVar2, zdcVar, (ykd) b21.A(as9Var, q95Var));
                    int i5 = (int) (jQ >> 32);
                    int i6 = (int) (4294967295L & jQ);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        aacVar = (aac) gg7Var.b;
                        if (aacVar != null) {
                            aacVar.r = rbc.s("100%");
                            aacVar2 = (aac) gg7Var.b;
                            if (aacVar2 != null) {
                                aacVar2.s = rbc.s("100%");
                                str = (String) b21.A(as9Var, xw6.a);
                                if (str != null) {
                                    vea veaVar = new vea(3);
                                    v71 v71Var = new v71(2);
                                    i71 i71Var = new i71(str);
                                    i71Var.f0();
                                    veaVar.b = v71Var.h(i71Var);
                                    k47VarA.c = veaVar;
                                }
                                tbe tbeVar = new tbe(gg7Var, (vea) k47VarA.c, i5, i6);
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                                tbeVar.e(new Canvas(bitmapCreateBitmap));
                                return new jm3(new gz0(bitmapCreateBitmap), true);
                            }
                            qc0.j("SVG document is empty");
                        } else {
                            qc0.j("SVG document is empty");
                        }
                    } else {
                        ykd ykdVar3 = (ykd) b21.A(as9Var, q95Var);
                        float f3 = i5 / f;
                        float f4 = i6 / f2;
                        int iOrdinal = zdcVar.ordinal();
                        if (iOrdinal == 0) {
                            fMax = Math.max(f3, f4);
                        } else if (iOrdinal == 1) {
                            fMax = Math.min(f3, f4);
                        } else {
                            ap.c();
                        }
                        b94 b94Var = ykdVar3.a;
                        if (b94Var instanceof z84) {
                            float f5 = ((z84) b94Var).a / f;
                            if (fMax > f5) {
                                fMax = f5;
                            }
                        }
                        b94 b94Var2 = ykdVar3.b;
                        if (b94Var2 instanceof z84) {
                            float f6 = ((z84) b94Var2).a / f2;
                            if (fMax > f6) {
                                fMax = f6;
                            }
                        }
                        i5 = (int) (fMax * f);
                        i6 = (int) (fMax * f2);
                        if (qbeVar == null) {
                            float f7 = f - 0.0f;
                            float f8 = f2 - 0.0f;
                            aac aacVar4 = (aac) gg7Var.b;
                            if (aacVar4 != null) {
                                aacVar4.o = new v79(0.0f, 0.0f, f7, f8);
                                aacVar = (aac) gg7Var.b;
                                if (aacVar != null) {
                                    aacVar.r = rbc.s("100%");
                                    aacVar2 = (aac) gg7Var.b;
                                    if (aacVar2 != null) {
                                        aacVar2.s = rbc.s("100%");
                                        str = (String) b21.A(as9Var, xw6.a);
                                        if (str != null) {
                                            vea veaVar2 = new vea(3);
                                            v71 v71Var2 = new v71(2);
                                            i71 i71Var2 = new i71(str);
                                            i71Var2.f0();
                                            veaVar2.b = v71Var2.h(i71Var2);
                                            k47VarA.c = veaVar2;
                                        }
                                        tbe tbeVar2 = new tbe(gg7Var, (vea) k47VarA.c, i5, i6);
                                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                                        tbeVar2.e(new Canvas(bitmapCreateBitmap2));
                                        return new jm3(new gz0(bitmapCreateBitmap2), true);
                                    }
                                    qc0.j("SVG document is empty");
                                } else {
                                    qc0.j("SVG document is empty");
                                }
                            } else {
                                qc0.j("SVG document is empty");
                            }
                        } else {
                            aacVar = (aac) gg7Var.b;
                            if (aacVar != null) {
                                aacVar.r = rbc.s("100%");
                                aacVar2 = (aac) gg7Var.b;
                                if (aacVar2 != null) {
                                    aacVar2.s = rbc.s("100%");
                                    str = (String) b21.A(as9Var, xw6.a);
                                    if (str != null) {
                                        vea veaVar3 = new vea(3);
                                        v71 v71Var3 = new v71(2);
                                        i71 i71Var3 = new i71(str);
                                        i71Var3.f0();
                                        veaVar3.b = v71Var3.h(i71Var3);
                                        k47VarA.c = veaVar3;
                                    }
                                    tbe tbeVar3 = new tbe(gg7Var, (vea) k47VarA.c, i5, i6);
                                    Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                                    tbeVar3.e(new Canvas(bitmapCreateBitmap3));
                                    return new jm3(new gz0(bitmapCreateBitmap3), true);
                                }
                                qc0.j("SVG document is empty");
                            } else {
                                qc0.j("SVG document is empty");
                            }
                        }
                    }
                } else {
                    qc0.j("SVG document is empty");
                }
                return null;
            case 4:
                ome omeVar = (ome) obj;
                omeVar.U0 = null;
                scc.k(omeVar);
                rs0.F(omeVar);
                qn4.G(omeVar);
                return Boolean.TRUE;
            case 5:
                PendingIntent actionIntent = ((RemoteAction) obj).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    hgc.Q(actionIntent);
                } else {
                    actionIntent.send();
                }
                return wefVar;
            case 6:
                lne lneVar = (lne) obj;
                return lneVar.Y ? tq.p(lneVar) : tme.b;
            case 7:
                fqe fqeVar = (fqe) obj;
                return new hl9(sfc.g(fqeVar.F0, fqeVar.G0, fqeVar.H0, ((e77) fqeVar.J0.getValue()).a));
            case 8:
                return new BaseInputConnection(((ite) obj).a, false);
            case 9:
                vpe vpeVar = ((ute) obj).a;
                upe upeVar = (upe) vpeVar.a.getValue();
                if (upeVar == null || (tpeVar = (tpe) vpeVar.b.getValue()) == null) {
                    return null;
                }
                return vpeVar.h(upeVar, tpeVar);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return new w67(((a77) obj).c());
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                lue lueVar = (lue) obj;
                lueVar.O0 = null;
                scc.k(lueVar);
                rs0.F(lueVar);
                qn4.G(lueVar);
                return Boolean.TRUE;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                HandlerThread handlerThread = new HandlerThread("CXCP-Camera-H", -3);
                handlerThread.start();
                ((nh1) obj).a(kh1.c, new m45(29, handlerThread));
                return new Handler(handlerThread.getLooper());
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return (Executor) ((ykc) obj).invoke();
            case 14:
                xye xyeVar = (xye) obj;
                xyeVar.c1.d(Boolean.valueOf(!xyeVar.b1));
                return wefVar;
            case 15:
                ((t6f) obj).k();
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((rcf) obj).n();
                return wefVar;
            case 17:
                return Integer.valueOf(((x6d) obj).c.size());
            case 18:
                return ((eab) ((mhf) obj).Q0).b();
            case 19:
                return Boolean.valueOf(((skf) obj).a.a().a(UltraWideFlashCaptureUnderexposureQuirk.class));
            case 20:
                ((VectorPainter) obj).w.setValue(wefVar);
                return wefVar;
            case 21:
                ((omb) obj).c();
                return wefVar;
            case 22:
                ((bp3) ((o8b) obj)).g(new yqf(4));
                return wefVar;
            case 23:
                lag lagVar = (lag) obj;
                String str2 = vv4.a;
                yag yagVar = lagVar.a;
                HashSet hashSet = new HashSet();
                hashSet.addAll(lagVar.e);
                HashSet hashSetB = lag.b(lagVar);
                Iterator it = hashSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hashSet.removeAll(lagVar.e);
                    } else if (hashSetB.contains((String) it.next())) {
                        z = true;
                    }
                }
                if (z) {
                    yg5.k(lagVar, ")", "WorkContinuation has cycles (");
                    return null;
                }
                WorkDatabase workDatabase = yagVar.c;
                si2 si2Var = yagVar.b;
                workDatabase.b();
                try {
                    dj6.A(workDatabase, si2Var, lagVar);
                    boolean zA = vv4.a(lagVar);
                    workDatabase.q();
                    workDatabase.m();
                    if (!zA) {
                        return wefVar;
                    }
                    efc.b(si2Var, yagVar.c, yagVar.e);
                    return wefVar;
                } catch (Throwable th5) {
                    workDatabase.m();
                    throw th5;
                }
            case 24:
                yag yagVar2 = (yag) obj;
                WorkDatabase workDatabase2 = yagVar2.c;
                Context context = yagVar2.a;
                String str3 = qce.e;
                if (Build.VERSION.SDK_INT >= 34) {
                    ig7.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListB = qce.b(context, jobScheduler);
                if (arrayListB != null && !arrayListB.isEmpty()) {
                    Iterator it2 = arrayListB.iterator();
                    while (it2.hasNext()) {
                        qce.a(jobScheduler, ((JobInfo) it2.next()).getId());
                    }
                }
                ((Number) urg.I(workDatabase2.x().a, false, true, new n8g(11))).intValue();
                efc.b(yagVar2.b, workDatabase2, yagVar2.e);
                return wefVar;
            default:
                yg1 yg1Var = ((deg) obj).a;
                CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                key.getClass();
                Object objC = ((nc1) yg1Var).c(key);
                if (objC != null) {
                    return (StreamConfigurationMap) objC;
                }
                qc0.p("Required value was null.");
                return null;
        }
    }

    public /* synthetic */ h2e(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
