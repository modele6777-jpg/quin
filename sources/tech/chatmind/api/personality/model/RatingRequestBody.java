package tech.chatmind.api.personality.model;

import defpackage.ag2;
import defpackage.an1;
import defpackage.bdb;
import defpackage.cdb;
import defpackage.ks0;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Ltech/chatmind/api/personality/model/RatingRequestBody;", "", "", "testId", "", "questionIndex", "rate", "<init>", "(Ljava/lang/String;II)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;IILxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/personality/model/RatingRequestBody;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;II)Ltech/chatmind/api/personality/model/RatingRequestBody;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestId", "I", "getQuestionIndex", "getRate", "Companion", "bdb", "cdb", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class RatingRequestBody {
    public static final int $stable = 0;
    public static final cdb Companion = new cdb();
    private final int questionIndex;
    private final int rate;
    private final String testId;

    public /* synthetic */ RatingRequestBody(int i, String str, int i2, int i3, xyc xycVar) {
        if (7 != (i & 7)) {
            an1.R(i, 7, bdb.a.e());
            throw null;
        }
        this.testId = str;
        this.questionIndex = i2;
        this.rate = i3;
    }

    public static /* synthetic */ RatingRequestBody copy$default(RatingRequestBody ratingRequestBody, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = ratingRequestBody.testId;
        }
        if ((i3 & 2) != 0) {
            i = ratingRequestBody.questionIndex;
        }
        if ((i3 & 4) != 0) {
            i2 = ratingRequestBody.rate;
        }
        return ratingRequestBody.copy(str, i, i2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(RatingRequestBody self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.testId);
        output.v(1, self.questionIndex, serialDesc);
        output.v(2, self.rate, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTestId() {
        return this.testId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getQuestionIndex() {
        return this.questionIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRate() {
        return this.rate;
    }

    public final RatingRequestBody copy(String testId, int questionIndex, int rate) {
        testId.getClass();
        return new RatingRequestBody(testId, questionIndex, rate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatingRequestBody)) {
            return false;
        }
        RatingRequestBody ratingRequestBody = (RatingRequestBody) other;
        return pa7.t(this.testId, ratingRequestBody.testId) && this.questionIndex == ratingRequestBody.questionIndex && this.rate == ratingRequestBody.rate;
    }

    public final int getQuestionIndex() {
        return this.questionIndex;
    }

    public final int getRate() {
        return this.rate;
    }

    public final String getTestId() {
        return this.testId;
    }

    public int hashCode() {
        return Integer.hashCode(this.rate) + ub3.b(this.questionIndex, this.testId.hashCode() * 31, 31);
    }

    public String toString() {
        return tec.g(this.rate, ")", ks0.p("RatingRequestBody(testId=", this.testId, ", questionIndex=", this.questionIndex, ", rate="));
    }

    public RatingRequestBody(String str, int i, int i2) {
        str.getClass();
        this.testId = str;
        this.questionIndex = i;
        this.rate = i2;
    }
}
