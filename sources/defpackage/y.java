package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class y implements l26 {
    public final /* synthetic */ int a;
    public static final y b = new y(0);
    public static final y c = new y(1);
    public static final y d = new y(2);
    public static final y e = new y(3);
    public static final y f = new y(4);
    public static final y g = new y(5);
    public static final y v = new y(6);
    public static final y w = new y(7);
    public static final y x = new y(8);
    public static final y y = new y(9);
    public static final y z = new y(10);
    public static final y X = new y(11);
    public static final y Y = new y(12);
    public static final y Z = new y(13);
    public static final y E0 = new y(14);
    public static final y F0 = new y(15);
    public static final y G0 = new y(16);
    public static final y H0 = new y(17);
    public static final y I0 = new y(18);
    public static final y J0 = new y(19);
    public static final y K0 = new y(20);
    public static final y L0 = new y(21);
    public static final y M0 = new y(22);
    public static final y N0 = new y(23);
    public static final y O0 = new y(24);
    public static final y P0 = new y(25);
    public static final y Q0 = new y(26);
    public static final y R0 = new y(27);
    public static final y S0 = new y(28);
    public static final y T0 = new y(29);

    public /* synthetic */ y(int i) {
        this.a = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        String str;
        m26 m26Var;
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                i10 i10Var = (i10) obj;
                fr8 fr8Var = (fr8) obj2;
                i10Var.getClass();
                fr8Var.getClass();
                return i10Var.c.get(fr8Var);
            case 1:
                i10 i10Var2 = (i10) obj;
                fr8 fr8Var2 = (fr8) obj2;
                i10Var2.getClass();
                fr8Var2.getClass();
                return i10Var2.b.get(fr8Var2);
            case 2:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                }
                return wefVar;
            case 3:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                }
                return wefVar;
            case 4:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                }
                return wefVar;
            case 5:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l46Var4.Z();
                }
                return wefVar;
            case 6:
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    l46Var5.Z();
                }
                return wefVar;
            case 7:
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (!l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    l46Var6.Z();
                }
                return wefVar;
            case 8:
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    y11.a.a(null, 0.0f, 0.0f, null, 0L, l46Var7, 196608);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 9:
                l46 l46Var8 = (l46) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (l46Var8.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    y11.a.a(null, 0.0f, 0.0f, null, 0L, l46Var8, 196608);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l46 l46Var9 = (l46) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (!l46Var9.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    l46Var9.Z();
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l46 l46Var10 = (l46) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (!l46Var10.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    l46Var10.Z();
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l46 l46Var11 = (l46) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (!l46Var11.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    l46Var11.Z();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l46 l46Var12 = (l46) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if (!l46Var12.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    l46Var12.Z();
                }
                return wefVar;
            case 14:
                l46 l46Var13 = (l46) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (!l46Var13.W(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    l46Var13.Z();
                }
                return wefVar;
            case 15:
                return Boolean.FALSE;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                yq8 yq8Var = (yq8) obj;
                kza kzaVar = (kza) obj2;
                HashSet hashSet = nm7.d;
                yq8Var.getClass();
                kzaVar.getClass();
                return yq8Var.g(kzaVar, true);
            case 17:
                yq8 yq8Var2 = (yq8) obj;
                kza kzaVar2 = (kza) obj2;
                int i2 = nn7.d;
                yq8Var2.getClass();
                kzaVar2.getClass();
                return yq8Var2.g(kzaVar2, true);
            case 18:
                l46 l46Var14 = (l46) obj;
                ((Number) obj2).intValue();
                l46Var14.f0(-511854661);
                y11 y11Var = y11.a;
                WeakHashMap weakHashMap = m8g.w;
                m58 m58Var = new m58(q7c.k(l46Var14).l, 48);
                l46Var14.r(false);
                return m58Var;
            case 19:
                l46 l46Var15 = (l46) obj;
                ((Number) obj2).intValue();
                l46Var15.f0(626488777);
                y72 y72Var = (y72) l46Var15.k(em2.a);
                long j = y72Var.a;
                l46Var15.r(false);
                return y72Var;
            case 20:
                l46 l46Var16 = (l46) obj;
                ((Number) obj2).intValue();
                l46Var16.f0(1457540156);
                y72 y72Var2 = (y72) l46Var16.k(b4c.b);
                long j2 = y72Var2.a;
                l46Var16.r(false);
                return y72Var2;
            case 21:
                long j3 = ((y72) obj2).a;
                return j3 == 16 ? Boolean.FALSE : Integer.valueOf(abg.Z(j3));
            case 22:
                f6 f6Var = (f6) obj;
                f6 f6Var2 = (f6) obj2;
                if (f6Var == null || (str = f6Var.a) == null) {
                    str = f6Var2.a;
                }
                if (f6Var == null || (m26Var = f6Var.b) == null) {
                    m26Var = f6Var2.b;
                }
                return new f6(str, m26Var);
            case 23:
                l46 l46Var17 = (l46) obj;
                ((Number) obj2).intValue();
                l46Var17.f0(-10845387);
                return tec.c(l46Var17, false, ((e8b) l46Var17.k(l8b.a)).i);
            case 24:
                l46 l46Var18 = (l46) obj;
                ((Number) obj2).intValue();
                l46Var18.f0(-981136394);
                return tec.c(l46Var18, false, ((e8b) l46Var18.k(l8b.a)).j);
            case 25:
                l46 l46Var19 = (l46) obj;
                ((Number) obj2).intValue();
                l46Var19.f0(-1951427401);
                return tec.c(l46Var19, false, ((m82) l46Var19.k(o82.a)).q);
            case 26:
                l46 l46Var20 = (l46) obj;
                ((Number) obj2).intValue();
                l46Var20.f0(1373248888);
                return tec.c(l46Var20, false, ((e8b) l46Var20.k(l8b.a)).t);
            case 27:
                l46 l46Var21 = (l46) obj;
                ((Number) obj2).intValue();
                l46Var21.f0(-454188111);
                return tec.c(l46Var21, false, ((e8b) l46Var21.k(l8b.a)).b);
            case 28:
                l46 l46Var22 = (l46) obj;
                ((Number) obj2).intValue();
                l46Var22.f0(-1424479118);
                return tec.c(l46Var22, false, ((e8b) l46Var22.k(l8b.a)).q);
            default:
                l46 l46Var23 = (l46) obj;
                ((Number) obj2).intValue();
                l46Var23.f0(1900197171);
                return tec.c(l46Var23, false, ((e8b) l46Var23.k(l8b.a)).i);
        }
    }
}
