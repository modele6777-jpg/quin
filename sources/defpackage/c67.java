package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c67 implements Externalizable {
    private static final long serialVersionUID = 0;
    private long epochSeconds;
    private int nanosecondsOfSecond;

    public c67(long j, int i) {
        this.epochSeconds = j;
        this.nanosecondsOfSecond = i;
    }

    private final Object readResolve() {
        w57 w57Var = w57.a;
        return mh3.y(this.nanosecondsOfSecond, this.epochSeconds);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        this.epochSeconds = objectInput.readLong();
        this.nanosecondsOfSecond = objectInput.readInt();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeLong(this.epochSeconds);
        objectOutput.writeInt(this.nanosecondsOfSecond);
    }
}
