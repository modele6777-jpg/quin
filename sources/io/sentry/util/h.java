package io.sentry.util;

import defpackage.yg5;
import io.sentry.android.replay.capture.v;
import io.sentry.l3;
import io.sentry.q5;
import io.sentry.y1;
import io.sentry.z0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements l3 {
    public final ArrayDeque a;

    public h(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.a = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    @Override // io.sentry.l3
    public final Object A0(z0 z0Var, y1 y1Var) {
        ArrayDeque arrayDeque = this.a;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            return null;
        }
        Object value = entry.getValue();
        if (z0Var != null) {
            return y1Var.a(this, z0Var);
        }
        arrayDeque.removeLast();
        return value;
    }

    @Override // io.sentry.l3
    public final Integer B() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return Integer.valueOf(((Number) objB).intValue());
        }
        return null;
    }

    @Override // io.sentry.l3
    public final Object D0() {
        return b();
    }

    @Override // io.sentry.l3
    public final void F(z0 z0Var, AbstractMap abstractMap, String str) {
        int size = this.a.size();
        try {
            abstractMap.put(str, b());
        } catch (Exception e) {
            z0Var.c(q5.ERROR, e, "Error deserializing unknown key: %s", str);
            h(size);
        }
    }

    @Override // io.sentry.l3
    public final Long H() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return Long.valueOf(((Number) objB).longValue());
        }
        return null;
    }

    @Override // io.sentry.l3
    public final TimeZone M(z0 z0Var) {
        String str = (String) b();
        if (str != null) {
            return TimeZone.getTimeZone(str);
        }
        return null;
    }

    @Override // io.sentry.l3
    public final ArrayList N0(z0 z0Var, y1 y1Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            if (b() == null) {
                return null;
            }
            v.b(peek(), "Expected null but was ");
            return null;
        }
        try {
            beginArray();
            ArrayList arrayList = new ArrayList();
            while (peek() != io.sentry.vendor.gson.stream.b.END_ARRAY) {
                int size = this.a.size();
                try {
                    arrayList.add(y1Var.a(this, z0Var));
                } catch (Exception e) {
                    z0Var.d(q5.WARNING, "Failed to deserialize object in list.", e);
                    h(size);
                }
            }
            endArray();
            return arrayList;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    @Override // io.sentry.l3
    public final String O() {
        return (String) b();
    }

    @Override // io.sentry.l3
    public final HashMap P(z0 z0Var, y1 y1Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            if (b() == null) {
                return null;
            }
            v.b(peek(), "Expected null but was ");
            return null;
        }
        try {
            beginObject();
            HashMap map = new HashMap();
            if (peek() == io.sentry.vendor.gson.stream.b.NAME) {
                while (true) {
                    String strNextName = nextName();
                    int size = this.a.size();
                    try {
                        map.put(strNextName, y1Var.a(this, z0Var));
                    } catch (Exception e) {
                        z0Var.d(q5.WARNING, "Failed to deserialize object in map.", e);
                        h(size);
                    }
                    if (peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                }
            }
            endObject();
            return map;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public final Object b() throws IOException {
        try {
            ArrayDeque arrayDeque = this.a;
            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
            if (entry == null) {
                return null;
            }
            Object value = entry.getValue();
            arrayDeque.removeLast();
            return value;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    @Override // io.sentry.l3
    public final void beginArray() throws IOException {
        ArrayDeque arrayDeque = this.a;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            yg5.m("No more entries");
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            yg5.m("Current token is not an object");
            return;
        }
        arrayDeque.removeLast();
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayDeque.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override // io.sentry.l3
    public final void beginObject() throws IOException {
        ArrayDeque arrayDeque = this.a;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            yg5.m("No more entries");
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof Map)) {
            yg5.m("Current token is not an object");
            return;
        }
        arrayDeque.removeLast();
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            arrayDeque.addLast((Map.Entry) it.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.clear();
    }

    @Override // io.sentry.l3
    public final Double e0() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return Double.valueOf(((Number) objB).doubleValue());
        }
        return null;
    }

    @Override // io.sentry.l3
    public final void endArray() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    @Override // io.sentry.l3
    public final void endObject() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    public final void h(int i) {
        while (true) {
            ArrayDeque arrayDeque = this.a;
            if (arrayDeque.isEmpty() || arrayDeque.size() < i) {
                return;
            } else {
                arrayDeque.removeLast();
            }
        }
    }

    @Override // io.sentry.l3
    public final boolean hasNext() {
        return !this.a.isEmpty();
    }

    @Override // io.sentry.l3
    public final double nextDouble() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return ((Number) objB).doubleValue();
        }
        yg5.m("Expected double");
        return 0.0d;
    }

    @Override // io.sentry.l3
    public final float nextFloat() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return ((Number) objB).floatValue();
        }
        yg5.m("Expected float");
        return 0.0f;
    }

    @Override // io.sentry.l3
    public final int nextInt() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return ((Number) objB).intValue();
        }
        yg5.m("Expected int");
        return 0;
    }

    @Override // io.sentry.l3
    public final long nextLong() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return ((Number) objB).longValue();
        }
        yg5.m("Expected long");
        return 0L;
    }

    @Override // io.sentry.l3
    public final String nextName() throws IOException {
        Map.Entry entry = (Map.Entry) this.a.peekLast();
        if (entry != null && entry.getKey() != null) {
            return (String) entry.getKey();
        }
        v.b(peek(), "Expected a name but was ");
        return null;
    }

    @Override // io.sentry.l3
    public final String nextString() throws IOException {
        String str = (String) b();
        if (str != null) {
            return str;
        }
        yg5.m("Expected string");
        return null;
    }

    @Override // io.sentry.l3
    public final Date o0(z0 z0Var) {
        String str = (String) b();
        if (str == null) {
            return null;
        }
        try {
            try {
                return io.sentry.config.a.l(str);
            } catch (Exception e) {
                z0Var.d(q5.ERROR, "Error when deserializing millis timestamp format.", e);
                return null;
            }
        } catch (Exception unused) {
            return io.sentry.config.a.m(str);
        }
    }

    @Override // io.sentry.l3
    public final io.sentry.vendor.gson.stream.b peek() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        if (entry.getKey() != null) {
            return io.sentry.vendor.gson.stream.b.NAME;
        }
        Object value = entry.getValue();
        if (value instanceof Map) {
            return io.sentry.vendor.gson.stream.b.BEGIN_OBJECT;
        }
        if (value instanceof List) {
            return io.sentry.vendor.gson.stream.b.BEGIN_ARRAY;
        }
        if (value instanceof String) {
            return io.sentry.vendor.gson.stream.b.STRING;
        }
        if (value instanceof Number) {
            return io.sentry.vendor.gson.stream.b.NUMBER;
        }
        if (value instanceof Boolean) {
            return io.sentry.vendor.gson.stream.b.BOOLEAN;
        }
        return value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
    }

    @Override // io.sentry.l3
    public final Boolean r0() {
        return (Boolean) b();
    }

    @Override // io.sentry.l3
    public final void skipValue() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        arrayDeque.removeLast();
    }

    @Override // io.sentry.l3
    public final Float y0() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return Float.valueOf(((Number) objB).floatValue());
        }
        return null;
    }

    @Override // io.sentry.l3
    public final void setLenient(boolean z) {
    }
}
