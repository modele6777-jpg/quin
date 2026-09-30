package defpackage;

import android.os.Build;
import android.os.Trace;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wr implements fo1 {
    public final qwe a;
    public final uf1 b;
    public final d3e c;
    public final rd1 d;
    public final i4e e;

    public wr(qwe qweVar, uf1 uf1Var, d3e d3eVar, rd1 rd1Var, i4e i4eVar) {
        qweVar.getClass();
        rd1Var.getClass();
        i4eVar.getClass();
        this.a = qweVar;
        this.b = uf1Var;
        this.c = d3eVar;
        this.d = rd1Var;
        this.e = i4eVar;
    }

    @Override // defpackage.fo1
    public final eo1 a(lf1 lf1Var, Map map, qo1 qo1Var) throws Exception {
        rf1 rf1VarB;
        qo1Var.getClass();
        uf1 uf1Var = this.b;
        if (uf1Var.h != 2) {
            yg5.q(kn2.b0(this.b.h), " for Extension CameraGraph", "Unsupported session mode: ");
            return null;
        }
        Object obj = uf1Var.g.get(ih1.a);
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num == null) {
            qc0.p("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.");
            return null;
        }
        int iIntValue = num.intValue();
        if (this.b.d != null) {
            qc0.p("Reprocessing is not supported for Extensions");
            return null;
        }
        nc1 nc1Var = (nc1) ((qd1) this.d).a(lf1Var.x());
        Set set = (Set) nc1Var.g.getValue();
        i4e i4eVar = this.e;
        if (!set.contains(Integer.valueOf(iIntValue))) {
            i4eVar.getClass();
            b1.l("CXCP", lf1Var + " does not support extension mode " + iIntValue + ". Supported extensions are " + set);
        }
        if (this.b.e != null) {
            synchronized (nc1Var.f) {
                rf1VarB = (rf1) nc1Var.f.get(Integer.valueOf(iIntValue));
            }
            if (rf1VarB == null) {
                qd1 qd1Var = nc1Var.c;
                String str = nc1Var.a;
                str.getClass();
                int i = Build.VERSION.SDK_INT;
                if (i < 31) {
                    throw new Exception(tec.e(i, "Extension sessions are only supported on Android S or higher. Device SDK is "));
                }
                try {
                    Trace.beginSection(((Object) ig1.b(str)) + "#awaitExtensionMetadata");
                    synchronized (qd1Var.g) {
                        rf1 rf1VarB2 = (rf1) qd1Var.g.get(str);
                        if (rf1VarB2 != null) {
                            rf1VarB = rf1VarB2;
                        } else if (qd1Var.e()) {
                            rf1VarB = qd1Var.b(iIntValue, str, true);
                        } else {
                            rf1VarB2 = qd1Var.b(iIntValue, str, false);
                            qd1Var.g.put(str, rf1VarB2);
                            rf1VarB = rf1VarB2;
                        }
                    }
                    Trace.endSection();
                    synchronized (nc1Var.f) {
                        nc1Var.f.put(Integer.valueOf(iIntValue), rf1VarB);
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            i4e i4eVar2 = this.e;
            if (!((Boolean) ((kc1) rf1VarB).d.getValue()).booleanValue()) {
                i4eVar2.getClass();
                b1.l("CXCP", lf1Var + " does not support Postview streams");
            }
            if (this.b.e.a.size() != 1) {
                qc0.p("Postview streams can only have one OutputStream.config object");
                return null;
            }
        }
        mt9 mt9VarT = k99.t(this.b, this.c, map);
        if (mt9VarT.a.isEmpty()) {
            b1.l("CXCP", "Failed to create OutputConfigurations for " + this.b);
            qo1Var.a();
            return qk6.g;
        }
        if (!mt9VarT.b.isEmpty()) {
            qc0.p("Deferred output is not supported for Extensions");
            return null;
        }
        w85 w85Var = new w85(qo1Var);
        ArrayList arrayList = mt9VarT.a;
        ft ftVar = new ft(this.a.a());
        uf1 uf1Var2 = this.b;
        if (lf1Var.L0(new v85(arrayList, ftVar, qo1Var, uf1Var2.f, uf1Var2.g, Integer.valueOf(iIntValue), w85Var, mt9VarT.c))) {
            return new do1(mt9VarT.b, mt9VarT.d);
        }
        b1.l("CXCP", "Failed to create ExtensionCaptureSession from " + lf1Var + " for " + qo1Var + '!');
        qo1Var.a();
        return qk6.g;
    }
}
