package tech.chatmind.api;

import defpackage.an1;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.umf;
import defpackage.vmf;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Ltech/chatmind/api/UserInfo;", "", "Ltech/chatmind/api/User;", "user", "<init>", "(Ltech/chatmind/api/User;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/User;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/UserInfo;Lag2;Lnyc;)V", "write$Self", "component1", "()Ltech/chatmind/api/User;", "copy", "(Ltech/chatmind/api/User;)Ltech/chatmind/api/UserInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltech/chatmind/api/User;", "getUser", "Companion", "vmf", "umf", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class UserInfo {
    public static final int $stable = 0;
    public static final vmf Companion = new vmf();
    public static final String DEFAULT_NAME = "User";
    private final User user;

    public /* synthetic */ UserInfo(int i, User user, xyc xycVar) {
        if (1 == (i & 1)) {
            this.user = user;
        } else {
            an1.R(i, 1, umf.a.e());
            throw null;
        }
    }

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, User user, int i, Object obj) {
        if ((i & 1) != 0) {
            user = userInfo.user;
        }
        return userInfo.copy(user);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public final UserInfo copy(User user) {
        return new UserInfo(user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UserInfo) && pa7.t(this.user, ((UserInfo) other).user);
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        User user = this.user;
        if (user == null) {
            return 0;
        }
        return user.hashCode();
    }

    public String toString() {
        return "UserInfo(user=" + this.user + ")";
    }

    public UserInfo(User user) {
        this.user = user;
    }
}
