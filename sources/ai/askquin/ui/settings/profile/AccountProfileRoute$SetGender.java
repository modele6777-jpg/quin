package ai.askquin.ui.settings.profile;

import defpackage.an1;
import defpackage.ca;
import defpackage.da;
import defpackage.ea;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.q;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;
import tech.chatmind.api.Gender;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"ai/askquin/ui/settings/profile/AccountProfileRoute$SetGender", "Lea;", "Ltech/chatmind/api/Gender;", "default", "<init>", "(Ltech/chatmind/api/Gender;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/Gender;Lxyc;)V", "Lai/askquin/ui/settings/profile/AccountProfileRoute$SetGender;", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/settings/profile/AccountProfileRoute$SetGender;Lag2;Lnyc;)V", "write$Self", "component1", "()Ltech/chatmind/api/Gender;", "copy", "(Ltech/chatmind/api/Gender;)Lai/askquin/ui/settings/profile/AccountProfileRoute$SetGender;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltech/chatmind/api/Gender;", "getDefault", "Companion", "ca", "da", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class AccountProfileRoute$SetGender implements ea {
    public static final int $stable = 0;
    private final Gender default;
    public static final da Companion = new da();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new q(6))};

    public /* synthetic */ AccountProfileRoute$SetGender(int i, Gender gender, xyc xycVar) {
        if (1 == (i & 1)) {
            this.default = gender;
        } else {
            an1.R(i, 1, ca.a.e());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return Gender.Companion.serializer();
    }

    public static /* synthetic */ AccountProfileRoute$SetGender copy$default(AccountProfileRoute$SetGender accountProfileRoute$SetGender, Gender gender, int i, Object obj) {
        if ((i & 1) != 0) {
            gender = accountProfileRoute$SetGender.default;
        }
        return accountProfileRoute$SetGender.copy(gender);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Gender getDefault() {
        return this.default;
    }

    public final AccountProfileRoute$SetGender copy(Gender gender) {
        return new AccountProfileRoute$SetGender(gender);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AccountProfileRoute$SetGender) && this.default == ((AccountProfileRoute$SetGender) other).default;
    }

    public final Gender getDefault() {
        return this.default;
    }

    public int hashCode() {
        Gender gender = this.default;
        if (gender == null) {
            return 0;
        }
        return gender.hashCode();
    }

    public String toString() {
        return "SetGender(default=" + this.default + ")";
    }

    public AccountProfileRoute$SetGender(Gender gender) {
        this.default = gender;
    }
}
