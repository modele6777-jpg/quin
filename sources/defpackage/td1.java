package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class td1 implements qtb {
    public final re1 a;
    public final CaptureRequest b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final ArrayMap f;
    public final boolean g;
    public final ctb v;
    public final long w;

    public td1(re1 re1Var, CaptureRequest captureRequest, Map map, Map map2, Map map3, ArrayMap arrayMap, boolean z, ctb ctbVar, long j) {
        re1Var.getClass();
        captureRequest.getClass();
        map2.getClass();
        map3.getClass();
        this.a = re1Var;
        this.b = captureRequest;
        this.c = map;
        this.d = map2;
        this.e = map3;
        this.f = arrayMap;
        this.g = z;
        this.v = ctbVar;
        this.w = j;
    }

    @Override // defpackage.qtb
    public final long C0() {
        return this.w;
    }

    @Override // defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        kob kobVar = job.a;
        if (em7Var.equals(kobVar.b(CaptureRequest.class))) {
            CaptureRequest captureRequest = this.b;
            captureRequest.getClass();
            return captureRequest;
        }
        boolean zEquals = em7Var.equals(kobVar.b(CameraCaptureSession.class));
        re1 re1Var = this.a;
        if (zEquals) {
            Object objH0 = re1Var.H0(kobVar.b(CameraCaptureSession.class));
            if (objH0 != null) {
                return objH0;
            }
        } else {
            Class clsN = qc0.n();
            if (em7Var.equals(kobVar.b(clsN))) {
                if (Build.VERSION.SDK_INT >= 31) {
                    Object objH1 = re1Var.H0(kobVar.b(clsN));
                    if (objH1 != null) {
                        return objH1;
                    }
                } else {
                    qc0.p("Check failed.");
                }
            }
        }
        return null;
    }

    @Override // defpackage.qtb
    public final Map W() {
        return this.f;
    }

    @Override // defpackage.tu8
    public final Object a(ru8 ru8Var, wde wdeVar) {
        ru8Var.getClass();
        Object objB = b(ru8Var);
        return objB == null ? wdeVar : objB;
    }

    @Override // defpackage.tu8
    public final Object b(ru8 ru8Var) {
        Map map = this.v.c;
        ru8Var.getClass();
        Map map2 = this.e;
        if (map2.containsKey(ru8Var)) {
            return map2.get(ru8Var);
        }
        if (map.containsKey(ru8Var)) {
            return map.get(ru8Var);
        }
        Map map3 = this.d;
        return map3.containsKey(ru8Var) ? map3.get(ru8Var) : this.c.get(ru8Var);
    }

    @Override // defpackage.qtb
    public final ctb h() {
        return this.v;
    }

    @Override // defpackage.qtb
    public final boolean k0() {
        return this.g;
    }
}
