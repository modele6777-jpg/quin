package defpackage;

import ai.askquin.ui.web.WebViewActivity;
import android.graphics.Bitmap;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w77 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;

    public /* synthetic */ w77(e89 e89Var, int i) {
        this.a = i;
        this.b = e89Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.b;
        switch (i) {
            case 0:
                bwa bwaVar = (bwa) obj;
                bwaVar.getClass();
                e89Var.setValue(ym8.P(bwaVar));
                return wefVar;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                e89Var.setValue(bool);
                return wefVar;
            case 2:
                bv7 bv7Var = (bv7) obj;
                bv7Var.getClass();
                e89Var.setValue(bv7Var);
                return wefVar;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                e89Var.setValue(bool2);
                return wefVar;
            case 4:
                bv7 bv7Var2 = (bv7) obj;
                bv7Var2.getClass();
                e89Var.setValue(Integer.valueOf((int) (bv7Var2.l() >> 32)));
                return wefVar;
            case 5:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                e89Var.setValue(bool3);
                return wefVar;
            case 6:
                ((Boolean) obj).getClass();
                e89Var.setValue(Boolean.valueOf(!((Boolean) e89Var.getValue()).booleanValue()));
                return wefVar;
            case 7:
                e89Var.setValue((bv7) obj);
                return wefVar;
            case 8:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((a26) e89Var.getValue()).d(f)).floatValue());
            case 9:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                e89Var.setValue(bool4);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ued uedVar = (ued) obj;
                uedVar.getClass();
                Boolean bool5 = (Boolean) ((a26) e89Var.getValue()).d(uedVar);
                bool5.getClass();
                return bool5;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                List list = (List) obj;
                list.getClass();
                e89Var.setValue(list);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                e89Var.setValue((s13) obj);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                Integer num = (Integer) obj;
                num.getClass();
                e89Var.setValue(num);
                return wefVar;
            case 14:
                ((a26) e89Var.getValue()).d((hl9) obj);
                return wefVar;
            case 15:
                im2 im2Var = (im2) obj;
                im2Var.getClass();
                if (((Boolean) e89Var.getValue()).booleanValue()) {
                    ((vv7) im2Var).a();
                }
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                im2 im2Var2 = (im2) obj;
                im2Var2.getClass();
                if (((Boolean) e89Var.getValue()).booleanValue()) {
                    ((vv7) im2Var2).a();
                }
                return wefVar;
            case 17:
                e89Var.setValue((bv7) obj);
                return wefVar;
            case 18:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                a26 a26Var = (a26) e89Var.getValue();
                if (a26Var != null) {
                    a26Var.d(l1fVar);
                }
                return wefVar;
            case 19:
                ((bv7) obj).getClass();
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case 20:
                ((bv7) obj).getClass();
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case 21:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                e89Var.setValue(bool6);
                return wefVar;
            case 22:
                bwa bwaVar2 = (bwa) obj;
                bwaVar2.getClass();
                e89Var.setValue(bwaVar2.getType().a());
                return wefVar;
            case 23:
                Bitmap bitmap = (Bitmap) obj;
                int i2 = WebViewActivity.T0;
                bitmap.getClass();
                e89Var.setValue(bitmap);
                return wefVar;
            case 24:
                String str = (String) obj;
                int i3 = WebViewActivity.T0;
                str.getClass();
                e89Var.setValue(str);
                return wefVar;
            default:
                ued uedVar2 = (ued) obj;
                uedVar2.getClass();
                if (uedVar2 == ued.a) {
                    e89Var.setValue(Boolean.TRUE);
                }
                return Boolean.TRUE;
        }
    }
}
