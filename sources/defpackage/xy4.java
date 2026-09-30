package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xy4 implements atb {
    public final /* synthetic */ za2 a;

    public xy4(za2 za2Var) {
        this.a = za2Var;
    }

    @Override // defpackage.atb
    public final void h0(qtb qtbVar, long j, ds dsVar) {
        es esVar = dsVar.b;
        CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
        key.getClass();
        esVar.getClass();
        Integer num = (Integer) esVar.a.get(key);
        CaptureResult.Key key2 = CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION;
        key2.getClass();
        esVar.getClass();
        Integer num2 = (Integer) esVar.a.get(key2);
        za2 za2Var = this.a;
        if (num == null || num2 == null) {
            if (num2 == null || num2.intValue() != 0) {
                return;
            }
            za2Var.R(0);
            return;
        }
        int iIntValue = num.intValue();
        if ((iIntValue == 2 || iIntValue == 3 || iIntValue == 4) && num2.intValue() == 0) {
            za2Var.R(0);
        }
    }
}
