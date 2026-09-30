package tech.chatmind.api;

import defpackage.j62;
import defpackage.k62;
import defpackage.pa7;
import defpackage.qu4;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.z7c;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc(with = k62.class)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\nR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\f¨\u0006\u001c"}, d2 = {"Ltech/chatmind/api/CloudMixedDeckSnapshot;", "", "", "version", "", "", "deckIDsByCardKey", "<init>", "(ILjava/util/Map;)V", "component1", "()I", "component2", "()Ljava/util/Map;", "copy", "(ILjava/util/Map;)Ltech/chatmind/api/CloudMixedDeckSnapshot;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getVersion", "Ljava/util/Map;", "getDeckIDsByCardKey", "Companion", "j62", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class CloudMixedDeckSnapshot {
    public static final int $stable = 8;
    public static final j62 Companion = new j62();
    private final Map<String, String> deckIDsByCardKey;
    private final int version;

    public /* synthetic */ CloudMixedDeckSnapshot(int i, Map map, int i2, rp3 rp3Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? qu4.a : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CloudMixedDeckSnapshot copy$default(CloudMixedDeckSnapshot cloudMixedDeckSnapshot, int i, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cloudMixedDeckSnapshot.version;
        }
        if ((i2 & 2) != 0) {
            map = cloudMixedDeckSnapshot.deckIDsByCardKey;
        }
        return cloudMixedDeckSnapshot.copy(i, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final Map<String, String> component2() {
        return this.deckIDsByCardKey;
    }

    public final CloudMixedDeckSnapshot copy(int version, Map<String, String> deckIDsByCardKey) {
        deckIDsByCardKey.getClass();
        return new CloudMixedDeckSnapshot(version, deckIDsByCardKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudMixedDeckSnapshot)) {
            return false;
        }
        CloudMixedDeckSnapshot cloudMixedDeckSnapshot = (CloudMixedDeckSnapshot) other;
        return this.version == cloudMixedDeckSnapshot.version && pa7.t(this.deckIDsByCardKey, cloudMixedDeckSnapshot.deckIDsByCardKey);
    }

    public final Map<String, String> getDeckIDsByCardKey() {
        return this.deckIDsByCardKey;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.deckIDsByCardKey.hashCode() + (Integer.hashCode(this.version) * 31);
    }

    public String toString() {
        return "CloudMixedDeckSnapshot(version=" + this.version + ", deckIDsByCardKey=" + this.deckIDsByCardKey + ")";
    }

    public CloudMixedDeckSnapshot(int i, Map<String, String> map) {
        map.getClass();
        this.version = i;
        this.deckIDsByCardKey = map;
    }

    public CloudMixedDeckSnapshot() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }
}
