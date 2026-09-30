package ai.askquin.ui.onboard;

import defpackage.ag2;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.u7a;
import defpackage.ub3;
import defpackage.vy9;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267BW\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ`\u0010$\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u001cR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b3\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b4\u0010\u001f¨\u00068"}, d2 = {"Lai/askquin/ui/onboard/PendingUserProfile;", "", "", "", "quinSource", "intentions", "birthday", "", "birthdayWasEdited", "accountId", "revision", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/onboard/PendingUserProfile;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Z", "component5", "component6", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lai/askquin/ui/onboard/PendingUserProfile;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getQuinSource", "getIntentions", "Ljava/lang/String;", "getBirthday", "Z", "getBirthdayWasEdited", "getAccountId", "getRevision", "Companion", "t7a", "u7a", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class PendingUserProfile {
    private static final lw7[] $childSerializers;
    public static final int $stable = 0;
    public static final u7a Companion = new u7a();
    private final String accountId;
    private final String birthday;
    private final boolean birthdayWasEdited;
    private final List<String> intentions;
    private final List<String> quinSource;
    private final String revision;

    static {
        vy9 vy9Var = new vy9(20);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{eb3.N(z18Var, vy9Var), eb3.N(z18Var, new vy9(21)), null, null, null, null};
    }

    public /* synthetic */ PendingUserProfile(int i, List list, List list2, String str, boolean z, String str2, String str3, xyc xycVar) {
        if ((i & 1) == 0) {
            this.quinSource = null;
        } else {
            this.quinSource = list;
        }
        if ((i & 2) == 0) {
            this.intentions = null;
        } else {
            this.intentions = list2;
        }
        if ((i & 4) == 0) {
            this.birthday = null;
        } else {
            this.birthday = str;
        }
        if ((i & 8) == 0) {
            this.birthdayWasEdited = false;
        } else {
            this.birthdayWasEdited = z;
        }
        if ((i & 16) == 0) {
            this.accountId = null;
        } else {
            this.accountId = str2;
        }
        if ((i & 32) == 0) {
            this.revision = "";
        } else {
            this.revision = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(p4e.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(p4e.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PendingUserProfile copy$default(PendingUserProfile pendingUserProfile, List list, List list2, String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pendingUserProfile.quinSource;
        }
        if ((i & 2) != 0) {
            list2 = pendingUserProfile.intentions;
        }
        if ((i & 4) != 0) {
            str = pendingUserProfile.birthday;
        }
        if ((i & 8) != 0) {
            z = pendingUserProfile.birthdayWasEdited;
        }
        if ((i & 16) != 0) {
            str2 = pendingUserProfile.accountId;
        }
        if ((i & 32) != 0) {
            str3 = pendingUserProfile.revision;
        }
        String str4 = str2;
        String str5 = str3;
        return pendingUserProfile.copy(list, list2, str, z, str4, str5);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(PendingUserProfile self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || self.quinSource != null) {
            output.A(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.quinSource);
        }
        if (output.g(serialDesc) || self.intentions != null) {
            output.A(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.intentions);
        }
        if (output.g(serialDesc) || self.birthday != null) {
            output.A(serialDesc, 2, p4e.a, self.birthday);
        }
        if (output.g(serialDesc) || self.birthdayWasEdited) {
            output.o(serialDesc, 3, self.birthdayWasEdited);
        }
        if (output.g(serialDesc) || self.accountId != null) {
            output.A(serialDesc, 4, p4e.a, self.accountId);
        }
        if (!output.g(serialDesc) && pa7.t(self.revision, "")) {
            return;
        }
        output.w(serialDesc, 5, self.revision);
    }

    public final List<String> component1() {
        return this.quinSource;
    }

    public final List<String> component2() {
        return this.intentions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getBirthdayWasEdited() {
        return this.birthdayWasEdited;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRevision() {
        return this.revision;
    }

    public final PendingUserProfile copy(List<String> quinSource, List<String> intentions, String birthday, boolean birthdayWasEdited, String accountId, String revision) {
        revision.getClass();
        return new PendingUserProfile(quinSource, intentions, birthday, birthdayWasEdited, accountId, revision);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingUserProfile)) {
            return false;
        }
        PendingUserProfile pendingUserProfile = (PendingUserProfile) other;
        return pa7.t(this.quinSource, pendingUserProfile.quinSource) && pa7.t(this.intentions, pendingUserProfile.intentions) && pa7.t(this.birthday, pendingUserProfile.birthday) && this.birthdayWasEdited == pendingUserProfile.birthdayWasEdited && pa7.t(this.accountId, pendingUserProfile.accountId) && pa7.t(this.revision, pendingUserProfile.revision);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final boolean getBirthdayWasEdited() {
        return this.birthdayWasEdited;
    }

    public final List<String> getIntentions() {
        return this.intentions;
    }

    public final List<String> getQuinSource() {
        return this.quinSource;
    }

    public final String getRevision() {
        return this.revision;
    }

    public int hashCode() {
        List<String> list = this.quinSource;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.intentions;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.birthday;
        int iD = ub3.d((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.birthdayWasEdited);
        String str2 = this.accountId;
        return this.revision.hashCode() + ((iD + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        List<String> list = this.quinSource;
        List<String> list2 = this.intentions;
        String str = this.birthday;
        boolean z = this.birthdayWasEdited;
        String str2 = this.accountId;
        String str3 = this.revision;
        StringBuilder sb = new StringBuilder("PendingUserProfile(quinSource=");
        sb.append(list);
        sb.append(", intentions=");
        sb.append(list2);
        sb.append(", birthday=");
        sb.append(str);
        sb.append(", birthdayWasEdited=");
        sb.append(z);
        sb.append(", accountId=");
        return ks0.m(sb, str2, ", revision=", str3, ")");
    }

    public PendingUserProfile() {
        this((List) null, (List) null, (String) null, false, (String) null, (String) null, 63, (rp3) null);
    }

    public PendingUserProfile(List<String> list, List<String> list2, String str, boolean z, String str2, String str3) {
        str3.getClass();
        this.quinSource = list;
        this.intentions = list2;
        this.birthday = str;
        this.birthdayWasEdited = z;
        this.accountId = str2;
        this.revision = str3;
    }

    public /* synthetic */ PendingUserProfile(List list, List list2, String str, boolean z, String str2, String str3, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? "" : str3);
    }
}
