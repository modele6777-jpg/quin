package tech.chatmind.api.personality.model;

import com.adjust.sdk.network.ErrorCodes;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.an1;
import defpackage.eb3;
import defpackage.faa;
import defpackage.gaa;
import defpackage.job;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.vy9;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.time.OffsetDateTime;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FGB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011By\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010!Jv\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0017J\u001a\u0010)\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b\u0007\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b9\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b:\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b;\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b<\u0010\u0019R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b>\u0010!R \u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010=\u0012\u0004\bB\u0010@\u001a\u0004\bA\u0010!R\"\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010=\u0012\u0004\bD\u0010@\u001a\u0004\bC\u0010!¨\u0006H"}, d2 = {"Ltech/chatmind/api/personality/model/PersonalityAnalysis;", "", "", "currentQuestionIndex", "", "desc", "", "isFinished", "name", "submittedTests", "testId", "testImage", "Ljava/time/OffsetDateTime;", "createdAt", "updatedAt", "finishedAt", "<init>", "(ILjava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(IILjava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Lxyc;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "component5", "component6", "component7", "component8", "()Ljava/time/OffsetDateTime;", "component9", "component10", "copy", "(ILjava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)Ltech/chatmind/api/personality/model/PersonalityAnalysis;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/personality/model/PersonalityAnalysis;Lag2;Lnyc;)V", "write$Self", "I", "getCurrentQuestionIndex", "Ljava/lang/String;", "getDesc", "Z", "getName", "getSubmittedTests", "getTestId", "getTestImage", "Ljava/time/OffsetDateTime;", "getCreatedAt", "getCreatedAt$annotations", "()V", "getUpdatedAt", "getUpdatedAt$annotations", "getFinishedAt", "getFinishedAt$annotations", "Companion", "faa", "gaa", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class PersonalityAnalysis {
    private static final lw7[] $childSerializers;
    public static final int $stable = 8;
    public static final gaa Companion = new gaa();
    private final OffsetDateTime createdAt;
    private final int currentQuestionIndex;
    private final String desc;
    private final OffsetDateTime finishedAt;
    private final boolean isFinished;
    private final String name;
    private final int submittedTests;
    private final String testId;
    private final String testImage;
    private final OffsetDateTime updatedAt;

    static {
        vy9 vy9Var = new vy9(24);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, null, null, null, null, null, null, eb3.N(z18Var, vy9Var), eb3.N(z18Var, new vy9(25)), eb3.N(z18Var, new vy9(26))};
    }

    public /* synthetic */ PersonalityAnalysis(int i, int i2, String str, boolean z, String str2, int i3, String str3, String str4, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, OffsetDateTime offsetDateTime3, xyc xycVar) {
        if (1007 != (i & ErrorCodes.IO_EXCEPTION)) {
            an1.R(i, ErrorCodes.IO_EXCEPTION, faa.a.e());
            throw null;
        }
        this.currentQuestionIndex = i2;
        this.desc = str;
        this.isFinished = z;
        this.name = str2;
        if ((i & 16) == 0) {
            this.submittedTests = 0;
        } else {
            this.submittedTests = i3;
        }
        this.testId = str3;
        this.testImage = str4;
        this.createdAt = offsetDateTime;
        this.updatedAt = offsetDateTime2;
        this.finishedAt = offsetDateTime3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _childSerializers$_anonymous_() {
        return new wn2(job.a.b(OffsetDateTime.class), new xn7[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _childSerializers$_anonymous_$0() {
        return new wn2(job.a.b(OffsetDateTime.class), new xn7[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _childSerializers$_anonymous_$1() {
        return new wn2(job.a.b(OffsetDateTime.class), new xn7[0]);
    }

    public static /* synthetic */ PersonalityAnalysis copy$default(PersonalityAnalysis personalityAnalysis, int i, String str, boolean z, String str2, int i2, String str3, String str4, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, OffsetDateTime offsetDateTime3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = personalityAnalysis.currentQuestionIndex;
        }
        if ((i3 & 2) != 0) {
            str = personalityAnalysis.desc;
        }
        if ((i3 & 4) != 0) {
            z = personalityAnalysis.isFinished;
        }
        if ((i3 & 8) != 0) {
            str2 = personalityAnalysis.name;
        }
        if ((i3 & 16) != 0) {
            i2 = personalityAnalysis.submittedTests;
        }
        if ((i3 & 32) != 0) {
            str3 = personalityAnalysis.testId;
        }
        if ((i3 & 64) != 0) {
            str4 = personalityAnalysis.testImage;
        }
        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            offsetDateTime = personalityAnalysis.createdAt;
        }
        if ((i3 & 256) != 0) {
            offsetDateTime2 = personalityAnalysis.updatedAt;
        }
        if ((i3 & 512) != 0) {
            offsetDateTime3 = personalityAnalysis.finishedAt;
        }
        OffsetDateTime offsetDateTime4 = offsetDateTime2;
        OffsetDateTime offsetDateTime5 = offsetDateTime3;
        String str5 = str4;
        OffsetDateTime offsetDateTime6 = offsetDateTime;
        int i4 = i2;
        String str6 = str3;
        return personalityAnalysis.copy(i, str, z, str2, i4, str6, str5, offsetDateTime6, offsetDateTime4, offsetDateTime5);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(PersonalityAnalysis self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.v(0, self.currentQuestionIndex, serialDesc);
        output.w(serialDesc, 1, self.desc);
        output.o(serialDesc, 2, self.isFinished);
        output.w(serialDesc, 3, self.name);
        if (output.g(serialDesc) || self.submittedTests != 0) {
            output.v(4, self.submittedTests, serialDesc);
        }
        output.w(serialDesc, 5, self.testId);
        output.w(serialDesc, 6, self.testImage);
        output.p(serialDesc, 7, (xn7) lw7VarArr[7].getValue(), self.createdAt);
        output.p(serialDesc, 8, (xn7) lw7VarArr[8].getValue(), self.updatedAt);
        output.A(serialDesc, 9, (xn7) lw7VarArr[9].getValue(), self.finishedAt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCurrentQuestionIndex() {
        return this.currentQuestionIndex;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final OffsetDateTime getFinishedAt() {
        return this.finishedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsFinished() {
        return this.isFinished;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSubmittedTests() {
        return this.submittedTests;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTestId() {
        return this.testId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTestImage() {
        return this.testImage;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public final PersonalityAnalysis copy(int currentQuestionIndex, String desc, boolean isFinished, String name, int submittedTests, String testId, String testImage, OffsetDateTime createdAt, OffsetDateTime updatedAt, OffsetDateTime finishedAt) {
        desc.getClass();
        name.getClass();
        testId.getClass();
        testImage.getClass();
        createdAt.getClass();
        updatedAt.getClass();
        return new PersonalityAnalysis(currentQuestionIndex, desc, isFinished, name, submittedTests, testId, testImage, createdAt, updatedAt, finishedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalityAnalysis)) {
            return false;
        }
        PersonalityAnalysis personalityAnalysis = (PersonalityAnalysis) other;
        return this.currentQuestionIndex == personalityAnalysis.currentQuestionIndex && pa7.t(this.desc, personalityAnalysis.desc) && this.isFinished == personalityAnalysis.isFinished && pa7.t(this.name, personalityAnalysis.name) && this.submittedTests == personalityAnalysis.submittedTests && pa7.t(this.testId, personalityAnalysis.testId) && pa7.t(this.testImage, personalityAnalysis.testImage) && pa7.t(this.createdAt, personalityAnalysis.createdAt) && pa7.t(this.updatedAt, personalityAnalysis.updatedAt) && pa7.t(this.finishedAt, personalityAnalysis.finishedAt);
    }

    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    public final int getCurrentQuestionIndex() {
        return this.currentQuestionIndex;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final OffsetDateTime getFinishedAt() {
        return this.finishedAt;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSubmittedTests() {
        return this.submittedTests;
    }

    public final String getTestId() {
        return this.testId;
    }

    public final String getTestImage() {
        return this.testImage;
    }

    public final OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = (this.updatedAt.hashCode() + ((this.createdAt.hashCode() + ub3.c(ub3.c(ub3.b(this.submittedTests, ub3.c(ub3.d(ub3.c(Integer.hashCode(this.currentQuestionIndex) * 31, 31, this.desc), 31, this.isFinished), 31, this.name), 31), 31, this.testId), 31, this.testImage)) * 31)) * 31;
        OffsetDateTime offsetDateTime = this.finishedAt;
        return iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode());
    }

    public final boolean isFinished() {
        return this.isFinished;
    }

    public String toString() {
        return "PersonalityAnalysis(currentQuestionIndex=" + this.currentQuestionIndex + ", desc=" + this.desc + ", isFinished=" + this.isFinished + ", name=" + this.name + ", submittedTests=" + this.submittedTests + ", testId=" + this.testId + ", testImage=" + this.testImage + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", finishedAt=" + this.finishedAt + ")";
    }

    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getFinishedAt$annotations() {
    }

    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public PersonalityAnalysis(int i, String str, boolean z, String str2, int i2, String str3, String str4, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, OffsetDateTime offsetDateTime3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        offsetDateTime.getClass();
        offsetDateTime2.getClass();
        this.currentQuestionIndex = i;
        this.desc = str;
        this.isFinished = z;
        this.name = str2;
        this.submittedTests = i2;
        this.testId = str3;
        this.testImage = str4;
        this.createdAt = offsetDateTime;
        this.updatedAt = offsetDateTime2;
        this.finishedAt = offsetDateTime3;
    }

    public /* synthetic */ PersonalityAnalysis(int i, String str, boolean z, String str2, int i2, String str3, String str4, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, OffsetDateTime offsetDateTime3, int i3, rp3 rp3Var) {
        this(i, str, z, str2, (i3 & 16) != 0 ? 0 : i2, str3, str4, offsetDateTime, offsetDateTime2, offsetDateTime3);
    }
}
