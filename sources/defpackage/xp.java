package defpackage;

import android.widget.TextView;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xp implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ xp(j18 j18Var, int i) {
        this.a = 12;
        this.b = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                Class cls = AndroidComposeView.X1;
                return Boolean.valueOf(((oo5) obj).s1(i2));
            case 1:
                Class cls2 = AndroidComposeView.X1;
                return Boolean.valueOf(((oo5) obj).s1(i2));
            case 2:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(tec.k("Collection doesn't contain element at index ", i2, '.'));
            case 3:
                ((Integer) obj).getClass();
                return Integer.valueOf(i2);
            case 4:
                return Integer.valueOf(((Integer) obj).intValue() * i2);
            case 5:
                return Integer.valueOf(((Integer) obj).intValue() * i2);
            case 6:
                return Boolean.valueOf(((oo5) obj).s1(i2));
            case 7:
                return Boolean.valueOf(((oo5) obj).s1(i2));
            case 8:
                return Boolean.valueOf(((oo5) obj).l1(i2));
            case 9:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("friend_coupon_page", "page_name");
                l1fVar.a(Integer.valueOf(i2), "remain_count");
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return Integer.valueOf(((Integer) obj).intValue() * i2);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return Integer.valueOf((-i2) * ((Integer) obj).intValue());
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                c08 c08Var = (c08) obj;
                ird irdVarJ = iqf.j();
                iqf.p(irdVarJ, iqf.l(irdVarJ), irdVarJ != null ? irdVarJ.e() : null);
                int i3 = c08Var.a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    c08Var.a(i2 + i4);
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                TextView textView = (TextView) obj;
                textView.getClass();
                textView.setTextColor(i2);
                return wefVar;
            case 14:
                TextView textView2 = (TextView) obj;
                textView2.getClass();
                textView2.setTextColor(i2);
                return wefVar;
            case 15:
                TextView textView3 = (TextView) obj;
                textView3.getClass();
                textView3.setTextColor(i2);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.a("open_notification", "popup");
                l1fVar2.a("open_notification", "pathway");
                l1fVar2.a(Integer.valueOf(i2), "touchpoint_id");
                return wefVar;
            case 17:
                ((sw3) obj).getClass();
                return new w67(((long) i2) << 32);
            case 18:
                ((sw3) obj).getClass();
                return new w67(((long) i2) << 32);
            case 19:
                l1f l1fVar3 = (l1f) obj;
                kv2.y(l1fVar3, "btn", "edit_card_meaning", "pathway", "homepage_photoReading_spreadInfoPage");
                l1fVar3.a(String.valueOf(i2), "card_index");
                return wefVar;
            default:
                l1f l1fVar4 = (l1f) obj;
                kv2.y(l1fVar4, "btn", "close", "pathway", "widget_onboarding");
                l1fVar4.a(Integer.valueOf(i2), "layer");
                return wefVar;
        }
    }

    public /* synthetic */ xp(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
