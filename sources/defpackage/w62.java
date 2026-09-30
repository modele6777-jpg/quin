package defpackage;

import tech.chatmind.api.User;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w62 implements a72 {
    public final User a;

    public w62(User user) {
        this.a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w62) && this.a.equals(((w62) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CodeVerifySuccess(user=" + this.a + ")";
    }
}
