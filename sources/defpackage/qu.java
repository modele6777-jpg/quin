package defpackage;

import ai.askquin.ui.settings.model.UserSubscriptionInformation;
import android.media.MediaCodec;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qu implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 1;
        switch (this.a) {
            case 0:
                return pa7.L(((zua) obj2).a, ((zua) obj).a);
            case 1:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            case 2:
                return Integer.compare(((rr5) obj2).k, ((rr5) obj).k);
            case 3:
                return Integer.compare(((xu1) obj2).b, ((xu1) obj).b);
            case 4:
                if (obj == null) {
                    return obj2 == null ? 0 : 1;
                }
                if (obj2 == null) {
                    return -1;
                }
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 5:
                return CrashlyticsReportPersistence.lambda$static$0((File) obj, (File) obj2);
            case 6:
                return CrashlyticsReportPersistence.oldestEventFileFirst((File) obj, (File) obj2);
            case 7:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 8:
                return Integer.compare(((st3) ((List) obj).get(0)).f, ((st3) ((List) obj2).get(0)).f);
            case 9:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i2 = 12;
                int i3 = 13;
                return ra2.f(zt3.c((zt3) Collections.max(list, new qu(i2)), (zt3) Collections.max(list2, new qu(i2)))).a(list.size(), list2.size()).b((zt3) Collections.max(list, new qu(i3)), (zt3) Collections.max(list2, new qu(i3)), new qu(i3)).e();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return ((rt3) Collections.max((List) obj)).compareTo((rt3) Collections.max((List) obj2));
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return ((wt3) ((List) obj).get(0)).compareTo((wt3) ((List) obj2).get(0));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return zt3.c((zt3) obj, (zt3) obj2);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                zt3 zt3Var = (zt3) obj;
                zt3 zt3Var2 = (zt3) obj2;
                boolean z = zt3Var.e;
                int i4 = zt3Var.x;
                is9 is9VarA = (z && zt3Var.v) ? au3.k : au3.k.a();
                zt3Var.f.getClass();
                ta2 ta2VarB = ta2.a.c(zt3Var.N0, zt3Var2.N0).b(Integer.valueOf(zt3Var.y), Integer.valueOf(zt3Var2.y), is9VarA);
                if (zt3Var.J0 && zt3Var.L0) {
                    ta2VarB = ta2VarB.a(zt3Var.M0, zt3Var2.M0);
                }
                return ta2VarB.c(zt3Var.K0, zt3Var2.K0).b(Integer.valueOf(i4), Integer.valueOf(zt3Var2.x), is9VarA).e();
            case 14:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i5 = 0; i5 < bArr.length; i5++) {
                    byte b = bArr[i5];
                    byte b2 = bArr2[i5];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 15:
                return pa7.L(((db7) obj).b, ((db7) obj2).b);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                z67 z67Var = (z67) obj;
                z67 z67Var2 = (z67) obj2;
                return (z67Var.b - z67Var.a) - (z67Var2.b - z67Var2.a);
            case 17:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                return layoutNode.J() == layoutNode2.J() ? pa7.L(layoutNode.G(), layoutNode2.G()) : Float.compare(layoutNode.J(), layoutNode2.J());
            case 18:
                return pa7.L(((vz7) obj).getIndex(), ((vz7) obj2).getIndex());
            case 19:
                zid zidVar = (zid) obj;
                zid zidVar2 = (zid) obj2;
                long j = zidVar.f;
                long j2 = zidVar2.f;
                if (j - j2 == 0) {
                    return zidVar.compareTo(zidVar2);
                }
                return j < j2 ? -1 : 1;
            case 20:
                return ((no0) obj).a.compareTo(((no0) obj2).a);
            case 21:
                return ((Number) ixc.b.z(obj, obj2)).intValue();
            case 22:
                return SessionReportingCoordinator.lambda$getSortedCustomAttributes$4((CrashlyticsReport.CustomAttribute) obj, (CrashlyticsReport.CustomAttribute) obj2);
            case 23:
                return ((hpd) obj).a - ((hpd) obj2).a;
            case 24:
                return Float.compare(((hpd) obj).c, ((hpd) obj2).c);
            case 25:
                bud budVar = (bud) obj;
                bud budVar2 = (bud) obj2;
                int iCompare = Integer.compare(budVar2.b, budVar.b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = budVar.c.compareTo(budVar2.c);
                return iCompareTo != 0 ? iCompareTo : budVar.d.compareTo(budVar2.d);
            case 26:
                bud budVar3 = (bud) obj;
                bud budVar4 = (bud) obj2;
                int iCompare2 = Integer.compare(budVar4.a, budVar3.a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = budVar4.c.compareTo(budVar3.c);
                return iCompareTo2 != 0 ? iCompareTo2 : budVar4.d.compareTo(budVar3.d);
            case 27:
                eq0 eq0Var = (eq0) obj2;
                Class cls = ((eq0) obj).a.j;
                int i6 = cls == MediaCodec.class ? 2 : (cls == wta.class || cls == k3e.class) ? 0 : 1;
                Class cls2 = eq0Var.a.j;
                if (cls2 == MediaCodec.class) {
                    i = 2;
                } else if (cls2 == wta.class || cls2 == k3e.class) {
                    i = 0;
                }
                return i6 - i;
            default:
                upf upfVar = upf.a;
                return UserSubscriptionInformation.countHeaderExpiredAt$lambda$1(upf.a, obj, obj2);
        }
    }

    public /* synthetic */ qu(int i) {
        this.a = i;
    }
}
