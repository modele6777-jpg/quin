package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface lf1 extends yff, ik0 {
    CaptureRequest.Builder E(TotalCaptureResult totalCaptureResult);

    void F0();

    boolean G(InputConfiguration inputConfiguration, ArrayList arrayList, qo1 qo1Var);

    boolean L0(v85 v85Var);

    void R();

    boolean U0(ArrayList arrayList, qo1 qo1Var);

    boolean g0(d0d d0dVar);

    CaptureRequest.Builder h0(int i);

    boolean l(f47 f47Var, ArrayList arrayList, qo1 qo1Var);

    boolean p0(List list, qe1 qe1Var);

    boolean u(ArrayList arrayList, qo1 qo1Var);

    String x();
}
