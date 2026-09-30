package defpackage;

import ai.askquin.R;
import ai.askquin.data.QuotaBlockReason;
import ai.askquin.datastore.model.RatingConditionRecord;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.QuotaUsageResponse;
import tech.chatmind.api.ReadingFeedbackData;
import tech.chatmind.api.ReadingFeedbackRequest;
import tech.chatmind.api.ReadingFeedbackTagsResponse;
import tech.chatmind.api.ReadingListResponse;
import tech.chatmind.api.ReadingResponse;
import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i7b implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ i7b(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        int i2 = 2;
        int i3 = 0;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return wefVar;
            case 4:
                return l8b.b;
            case 5:
                return x8b.b;
            case 6:
                return QuotaBlockReason._init_$_anonymous_();
            case 7:
                return QuotaUsage._childSerializers$_anonymous_();
            case 8:
                return QuotaUsage._childSerializers$_anonymous_$0();
            case 9:
                return QuotaUsage._childSerializers$_anonymous_$1();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return QuotaUsage._childSerializers$_anonymous_$2();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return QuotaUsageResponse._childSerializers$_anonymous_();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return QuotaUsageResponse._childSerializers$_anonymous_$0();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return QuotaUsageResponse._childSerializers$_anonymous_$1();
            case 14:
                return QuotaUsageResponse._childSerializers$_anonymous_$2();
            case 15:
                return RatingConditionRecord._childSerializers$_anonymous_();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return ReadingFeedbackData._childSerializers$_anonymous_();
            case 17:
                jcc.k(0, Integer.valueOf(R.string.reading_feedback_text_too_long));
                return wefVar;
            case 18:
                return ReadingFeedbackRequest._childSerializers$_anonymous_();
            case 19:
                return ReadingFeedbackTagsResponse._childSerializers$_anonymous_();
            case 20:
                return ReadingListResponse._childSerializers$_anonymous_();
            case 21:
                return ReadingResponse._childSerializers$_anonymous_();
            case 22:
            case 23:
            case 24:
            case 25:
                return null;
            case 26:
                x1f x1fVar = x1f.a;
                x1f.k(new r05("popup_view"), new z8b(18), 2);
                return wefVar;
            case 27:
                jcc.k(0, Integer.valueOf(R.string.reading_menu_copied));
                return wefVar;
            case 28:
                List listB1 = s72.b1((List) rzc.a.getValue(), new kv8(8));
                ArrayList arrayList = new ArrayList();
                int size = listB1.size();
                while (i3 < size) {
                    ((jm9) listB1.get(i3)).getClass();
                    arrayList.add(new iy9(new pd9(new ik9(i2)), job.a.b(qhf.class)));
                    i3++;
                }
                return arrayList;
            default:
                List listB2 = s72.b1((List) rzc.b.getValue(), new kv8(9));
                ArrayList arrayList2 = new ArrayList();
                int size2 = listB2.size();
                while (i3 < size2) {
                    arrayList2.add(((wm3) listB2.get(i3)).a());
                    i3++;
                }
                return arrayList2;
        }
    }
}
