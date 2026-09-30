package tech.chatmind.api;

import defpackage.hjb;
import defpackage.ijb;
import defpackage.lx4;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc(with = ijb.class)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Ltech/chatmind/api/RecommendQuestionType;", "", "", "wireValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getWireValue", "()Ljava/lang/String;", "Companion", "hjb", "CURRENT_STATE", "WHATS_NEXT", "WHAT_TO_DO", "NEED_CONFIRMATION", "WHY", "CARD_MEANING", "UNKNOWN", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public enum RecommendQuestionType {
    CURRENT_STATE("current_state"),
    WHATS_NEXT("whats_next"),
    WHAT_TO_DO("what_to_do"),
    NEED_CONFIRMATION("need_confirmation"),
    WHY("why"),
    CARD_MEANING("card_meaning"),
    UNKNOWN("unknown");

    private final String wireValue;
    private static final /* synthetic */ lx4 $ENTRIES = pa7.Q(values());
    public static final hjb Companion = new hjb();

    RecommendQuestionType(String str) {
        this.wireValue = str;
    }

    public static lx4 getEntries() {
        return $ENTRIES;
    }

    public final String getWireValue() {
        return this.wireValue;
    }
}
