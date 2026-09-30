package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.dailycard.o;
import ai.askquin.ui.explore.model.DailyCardBasicInfo;
import ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute$Detail;
import androidx.compose.foundation.layout.b;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o93 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ka9 b;

    public /* synthetic */ o93(ka9 ka9Var, int i) {
        this.a = i;
        this.b = ka9Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        i8c i8cVar = sf2.a;
        int i2 = 6;
        int i3 = 2;
        wef wefVar = wef.a;
        ka9 ka9Var = this.b;
        switch (i) {
            case 0:
                DailyCardBasicInfo dailyCardBasicInfo = (DailyCardBasicInfo) obj;
                xad xadVar = (xad) obj2;
                dailyCardBasicInfo.getClass();
                xadVar.getClass();
                ka9.e(ka9Var, o.e(dailyCardBasicInfo, xadVar), null, 6);
                break;
            case 1:
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj;
                String str = (String) obj2;
                tarotSkinIdentify.getClass();
                str.getClass();
                ka9.e(ka9Var, new ExploreTarotRoute$Detail(tarotSkinIdentify, str, 1, 0), null, 6);
                break;
            case 2:
                DailyCardBasicInfo dailyCardBasicInfo2 = (DailyCardBasicInfo) obj;
                xad xadVar2 = (xad) obj2;
                dailyCardBasicInfo2.getClass();
                xadVar2.getClass();
                ka9.e(ka9Var, o.e(dailyCardBasicInfo2, xadVar2), null, 6);
                break;
            case 3:
                TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) obj;
                String str2 = (String) obj2;
                tarotSkinIdentify2.getClass();
                str2.getClass();
                ka9.e(ka9Var, new ExploreTarotRoute$Detail(tarotSkinIdentify2, str2, 1, 0), null, 6);
                break;
            case 4:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    boolean zI = l46Var.i(ka9Var);
                    Object objR = l46Var.R();
                    if (zI || objR == i8cVar) {
                        objR = new a40(ka9Var, 5);
                        l46Var.p0(objR);
                    }
                    j74.n("Open", (x16) objR, l46Var, 6);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                j74.a(ka9Var, (l46) obj, k99.P(1));
                break;
            case 6:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    boolean zI2 = l46Var2.i(ka9Var);
                    Object objR2 = l46Var2.R();
                    if (zI2 || objR2 == i8cVar) {
                        objR2 = new a40(ka9Var, 7);
                        l46Var2.p0(objR2);
                    }
                    j74.n("Open", (x16) objR2, l46Var2, 6);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                j74.d(ka9Var, (l46) obj, k99.P(1));
                break;
            case 8:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    boolean zI3 = l46Var3.i(ka9Var);
                    Object objR3 = l46Var3.R();
                    if (zI3 || objR3 == i8cVar) {
                        objR3 = new a40(ka9Var, 13);
                        l46Var3.p0(objR3);
                    }
                    j74.n("打开", (x16) objR3, l46Var3, 6);
                }
                break;
            case 9:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l46Var4.Z();
                } else {
                    j74.y(ka9Var, l46Var4, 0);
                    j74.x(0, l46Var4);
                }
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                j74.H(ka9Var, (l46) obj, k99.P(1));
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                j74.e0(ka9Var, (l46) obj, k99.P(1));
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    l46Var5.Z();
                } else {
                    j74.X(ka9Var, l46Var5, 0);
                }
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    l46Var6.Z();
                } else {
                    boolean zI4 = l46Var6.i(ka9Var);
                    Object objR4 = l46Var6.R();
                    if (zI4 || objR4 == i8cVar) {
                        objR4 = new a40(ka9Var, 9);
                        l46Var6.p0(objR4);
                    }
                    j74.n("剩余 1 次", (x16) objR4, l46Var6, 6);
                    boolean zI5 = l46Var6.i(ka9Var);
                    Object objR5 = l46Var6.R();
                    if (zI5 || objR5 == i8cVar) {
                        objR5 = new a40(ka9Var, 10);
                        l46Var6.p0(objR5);
                    }
                    j74.n("已用完", (x16) objR5, l46Var6, 6);
                }
                break;
            case 14:
                ((Integer) obj2).getClass();
                j74.b0(ka9Var, (l46) obj, k99.P(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                j74.l(ka9Var, (l46) obj, k99.P(1));
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    l46Var7.Z();
                } else {
                    j74.t(ka9Var, null, l46Var7, 0);
                    j74.d0(b.c(g09.a, 1.0f), l46Var7, 6);
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                j74.E(ka9Var, (l46) obj, k99.P(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                j74.X(ka9Var, (l46) obj, k99.P(1));
                break;
            case 19:
                l46 l46Var8 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!l46Var8.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    l46Var8.Z();
                } else {
                    boolean zI6 = l46Var8.i(ka9Var);
                    Object objR6 = l46Var8.R();
                    if (zI6 || objR6 == i8cVar) {
                        objR6 = new a40(ka9Var, i2);
                        l46Var8.p0(objR6);
                    }
                    j74.n("信息收集→抽牌→Loading", (x16) objR6, l46Var8, 6);
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                j74.y(ka9Var, (l46) obj, k99.P(1));
                break;
            case 21:
                l46 l46Var9 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!l46Var9.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    l46Var9.Z();
                } else {
                    Object objR7 = l46Var9.R();
                    if (objR7 == i8cVar) {
                        objR7 = new vg3(26);
                        l46Var9.p0(objR7);
                    }
                    j74.n("重置", (x16) objR7, l46Var9, 54);
                    boolean zI7 = l46Var9.i(ka9Var);
                    Object objR8 = l46Var9.R();
                    if (zI7 || objR8 == i8cVar) {
                        objR8 = new a40(ka9Var, 12);
                        l46Var9.p0(objR8);
                    }
                    j74.n("打开", (x16) objR8, l46Var9, 6);
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                j74.D(ka9Var, (l46) obj, k99.P(1));
                break;
            case 23:
                l46 l46Var10 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!l46Var10.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    l46Var10.Z();
                } else {
                    j74.b0(ka9Var, l46Var10, 0);
                }
                break;
            case 24:
                l46 l46Var11 = (l46) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!l46Var11.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    l46Var11.Z();
                } else {
                    Object objR9 = l46Var11.R();
                    if (objR9 == i8cVar) {
                        objR9 = new vg3(15);
                        l46Var11.p0(objR9);
                    }
                    j74.n("重置", (x16) objR9, l46Var11, 54);
                    boolean zI8 = l46Var11.i(ka9Var);
                    Object objR10 = l46Var11.R();
                    if (zI8 || objR10 == i8cVar) {
                        objR10 = new a40(ka9Var, i3);
                        l46Var11.p0(objR10);
                    }
                    j74.n("打开", (x16) objR10, l46Var11, 6);
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                j74.G(ka9Var, (l46) obj, k99.P(1));
                break;
            case 26:
                l46 l46Var12 = (l46) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!l46Var12.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    l46Var12.Z();
                } else {
                    boolean zI9 = l46Var12.i(ka9Var);
                    Object objR11 = l46Var12.R();
                    if (zI9 || objR11 == i8cVar) {
                        objR11 = new a40(ka9Var, 3);
                        l46Var12.p0(objR11);
                    }
                    j74.n("Open", (x16) objR11, l46Var12, 6);
                }
                break;
            case 27:
                ((Integer) obj2).getClass();
                j74.z(ka9Var, (l46) obj, k99.P(1));
                break;
            case 28:
                l46 l46Var13 = (l46) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!l46Var13.W(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    l46Var13.Z();
                } else {
                    Object objR12 = l46Var13.R();
                    if (objR12 == i8cVar) {
                        objR12 = new vg3(25);
                        l46Var13.p0(objR12);
                    }
                    j74.n("重置", (x16) objR12, l46Var13, 54);
                    boolean zI10 = l46Var13.i(ka9Var);
                    Object objR13 = l46Var13.R();
                    if (zI10 || objR13 == i8cVar) {
                        objR13 = new a40(ka9Var, 11);
                        l46Var13.p0(objR13);
                    }
                    j74.n("打开", (x16) objR13, l46Var13, 6);
                }
                break;
            default:
                l46 l46Var14 = (l46) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!l46Var14.W(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    l46Var14.Z();
                } else {
                    j74.s(null, l46Var14, 0);
                    j74.l(ka9Var, l46Var14, 0);
                    j74.I(null, l46Var14, 0);
                    j74.J(0, l46Var14);
                    j74.K(ka9Var, l46Var14, 0);
                    j74.H(ka9Var, l46Var14, 0);
                    j74.m(0, l46Var14);
                    j74.C(0, l46Var14);
                    j74.L(0, l46Var14);
                    j74.w(null, l46Var14, 0);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ o93(ka9 ka9Var, int i, int i2) {
        this.a = i2;
        this.b = ka9Var;
    }
}
