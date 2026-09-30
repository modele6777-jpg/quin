package io.sentry;

import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface l3 extends Closeable {
    Object A0(z0 z0Var, y1 y1Var);

    Integer B();

    Object D0();

    void F(z0 z0Var, AbstractMap abstractMap, String str);

    Long H();

    TimeZone M(z0 z0Var);

    ArrayList N0(z0 z0Var, y1 y1Var);

    String O();

    HashMap P(z0 z0Var, y1 y1Var);

    void beginArray();

    void beginObject();

    Double e0();

    void endArray();

    void endObject();

    boolean hasNext();

    double nextDouble();

    float nextFloat();

    int nextInt();

    long nextLong();

    String nextName();

    String nextString();

    Date o0(z0 z0Var);

    io.sentry.vendor.gson.stream.b peek();

    Boolean r0();

    void setLenient(boolean z);

    void skipValue();

    Float y0();
}
