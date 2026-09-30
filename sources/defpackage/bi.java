package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bi {
    public final String a;
    public final String b;

    public bi(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi)) {
            return false;
        }
        bi biVar = (bi) obj;
        return pa7.t(this.a, biVar.a) && pa7.t(this.b, biVar.b);
    }

    public final int hashCode() {
        return ((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) - 1483370380) * 31) + 668938769;
    }

    public final String toString() {
        return tec.m("IdentifierData(conversationId=", this.a, ", userUid=", this.b, ", modelInfo=DeepSeek Chat, deepseekFilingId=Beijing-DeepSeekChat-202404280016)");
    }
}
