package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hd2 implements p26 {
    public final /* synthetic */ int a;

    public /* synthetic */ hd2(int i) {
        this.a = i;
    }

    @Override // defpackage.p26
    public final Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.a;
        int i2 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l26 l26Var = (l26) obj3;
                l46 l46Var = (l46) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                ((mx7) obj).getClass();
                ((m91) obj2).getClass();
                l26Var.getClass();
                if ((iIntValue & 384) == 0) {
                    if (l46Var.i(l26Var)) {
                        i2 = 256;
                    }
                    iIntValue |= i2;
                }
                if (!l46Var.W(iIntValue & 1, (iIntValue & 1153) != 1152)) {
                    l46Var.Z();
                } else {
                    l26Var.z(l46Var, Integer.valueOf((iIntValue >> 6) & 14));
                }
                break;
            case 1:
                l26 l26Var2 = (l26) obj3;
                l46 l46Var2 = (l46) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                ((d92) obj).getClass();
                ((m91) obj2).getClass();
                l26Var2.getClass();
                if ((iIntValue2 & 384) == 0) {
                    if (l46Var2.i(l26Var2)) {
                        i2 = 256;
                    }
                    iIntValue2 |= i2;
                }
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 1153) != 1152)) {
                    l46Var2.Z();
                } else {
                    l26Var2.z(l46Var2, Integer.valueOf((iIntValue2 >> 6) & 14));
                }
                break;
            case 2:
                hne hneVar = (hne) obj;
                ume umeVar = (ume) obj2;
                x16 x16Var = (x16) obj3;
                l46 l46Var3 = (l46) obj4;
                int iIntValue3 = ((Integer) obj5).intValue();
                int i3 = (iIntValue3 & 6) == 0 ? ((iIntValue3 & 8) == 0 ? l46Var3.g(hneVar) : l46Var3.i(hneVar) ? 4 : 2) | iIntValue3 : iIntValue3;
                if ((iIntValue3 & 48) == 0) {
                    i3 |= (iIntValue3 & 64) == 0 ? l46Var3.g(umeVar) : l46Var3.i(umeVar) ? 32 : 16;
                }
                if ((iIntValue3 & 384) == 0) {
                    if (l46Var3.i(x16Var)) {
                        i2 = 256;
                    }
                    i3 |= i2;
                }
                if (!l46Var3.W(i3 & 1, (i3 & 1171) != 1170)) {
                    l46Var3.Z();
                } else {
                    lt3.c(hneVar, umeVar, x16Var, l46Var3, i3 & 1022);
                }
                break;
            case 3:
                hne hneVar2 = (hne) obj;
                ume umeVar2 = (ume) obj2;
                x16 x16Var2 = (x16) obj3;
                l46 l46Var4 = (l46) obj4;
                int iIntValue4 = ((Integer) obj5).intValue();
                int i4 = (iIntValue4 & 6) == 0 ? ((iIntValue4 & 8) == 0 ? l46Var4.g(hneVar2) : l46Var4.i(hneVar2) ? 4 : 2) | iIntValue4 : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i4 |= (iIntValue4 & 64) == 0 ? l46Var4.g(umeVar2) : l46Var4.i(umeVar2) ? 32 : 16;
                }
                if ((iIntValue4 & 384) == 0) {
                    if (l46Var4.i(x16Var2)) {
                        i2 = 256;
                    }
                    i4 |= i2;
                }
                if (!l46Var4.W(i4 & 1, (i4 & 1171) != 1170)) {
                    l46Var4.Z();
                } else {
                    lt3.c(hneVar2, umeVar2, x16Var2, l46Var4, i4 & 1022);
                }
                break;
            case 4:
                l26 l26Var3 = (l26) obj3;
                l46 l46Var5 = (l46) obj4;
                int iIntValue5 = ((Integer) obj5).intValue();
                ((mx7) obj).getClass();
                ((r2g) obj2).getClass();
                l26Var3.getClass();
                if ((iIntValue5 & 384) == 0) {
                    if (l46Var5.i(l26Var3)) {
                        i2 = 256;
                    }
                    iIntValue5 |= i2;
                }
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 1153) != 1152)) {
                    l46Var5.Z();
                } else {
                    l26Var3.z(l46Var5, Integer.valueOf((iIntValue5 >> 6) & 14));
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((eue) obj5).a;
                String string = ((CharSequence) obj4).subSequence(eue.g(j), eue.f(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return wefVar;
    }
}
