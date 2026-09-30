package defpackage;

import android.graphics.Bitmap;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k50 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;

    public /* synthetic */ k50(int i, int i2, a26 a26Var) {
        this.a = i2;
        this.b = a26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        i8c i8cVar = sf2.a;
        wef wefVar = wef.a;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                bitmap.getClass();
                a26Var.d(bitmap);
                return wefVar;
            case 1:
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj;
                ((Integer) obj2).intValue();
                tarotCardChoice.getClass();
                a26Var.d(tarotCardChoice);
                return wefVar;
            case 2:
                Bitmap bitmap2 = (Bitmap) obj;
                bitmap2.getClass();
                a26Var.d(bitmap2);
                return wefVar;
            case 3:
                Bitmap bitmap3 = (Bitmap) obj;
                bitmap3.getClass();
                a26Var.d(bitmap3);
                return wefVar;
            case 4:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = l46Var.g(a26Var);
                    Object objR = l46Var.R();
                    if (zG || objR == i8cVar) {
                        objR = new zh1(a26Var, 9);
                        l46Var.p0(objR);
                    }
                    j74.n("不带码", (x16) objR, l46Var, 6);
                    boolean zG2 = l46Var.g(a26Var);
                    Object objR2 = l46Var.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new zh1(a26Var, 10);
                        l46Var.p0(objR2);
                    }
                    j74.n("带码企微", (x16) objR2, l46Var, 6);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 5:
                ((Integer) obj2).getClass();
                j74.i(a26Var, (l46) obj, k99.P(1));
                return wefVar;
            case 6:
                oia oiaVar = (oia) obj;
                oiaVar.getClass();
                oiaVar.a();
                a26Var.d((hl9) obj2);
                return wefVar;
            case 7:
                Bitmap bitmap4 = (Bitmap) obj;
                bitmap4.getClass();
                a26Var.d(bitmap4);
                return wefVar;
            case 8:
                Bitmap bitmap5 = (Bitmap) obj;
                bitmap5.getClass();
                a26Var.d(bitmap5);
                return wefVar;
            case 9:
                ((Integer) obj2).getClass();
                return (af6) a26Var.d((ex7) obj);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Bitmap bitmap6 = (Bitmap) obj;
                bitmap6.getClass();
                a26Var.d(bitmap6);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                Bitmap bitmap7 = (Bitmap) obj;
                bitmap7.getClass();
                a26Var.d(bitmap7);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                Bitmap bitmap8 = (Bitmap) obj;
                bitmap8.getClass();
                a26Var.d(bitmap8);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                sfc.a(a26Var, (l46) obj, k99.P(1));
                return wefVar;
            case 14:
                Bitmap bitmap9 = (Bitmap) obj;
                bitmap9.getClass();
                a26Var.d(bitmap9);
                return wefVar;
            case 15:
                Bitmap bitmap10 = (Bitmap) obj;
                bitmap10.getClass();
                a26Var.d(bitmap10);
                return wefVar;
            default:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd2 dd2Var = an1.X;
                    boolean zG3 = l46Var2.g(a26Var);
                    Object objR3 = l46Var2.R();
                    if (zG3 || objR3 == i8cVar) {
                        objR3 = new a5b(a26Var, 7);
                        l46Var2.p0(objR3);
                    }
                    pa7.a(null, 0L, 0L, null, dd2Var, null, false, false, (x16) objR3, l46Var2, 24576, 239);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ k50(a26 a26Var, int i) {
        this.a = i;
        this.b = a26Var;
    }
}
