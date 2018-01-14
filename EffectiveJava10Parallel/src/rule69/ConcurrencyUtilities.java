package rule69;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

public class ConcurrencyUtilities {
    private static final ConcurrentMap<String, String> map = new ConcurrentMap<String, String>() {
        
        // 병행 정규화
        public /*static*/ String intern(String s){
            String previousValue = map.putIfAbsent(s, s);
            return previousValue == null ? s : previousValue;
        }

        // 병행 정규화 성능향상
        public /*static*/ String intern2(String s){
            String result = map.get(s);
            if(result == null){
                result = map.putIfAbsent(s, s);
                if(result == null);
                result = s;
            }
            return result;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public String get(Object key) {
            return null;
        }

        @Override
        public String put(String key, String value) {
            return null;
        }

        @Override
        public String remove(Object key) {
            return null;
        }

        @Override
        public void putAll(Map<? extends String, ? extends String> m) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set<String> keySet() {
            return null;
        }

        @Override
        public Collection<String> values() {
            return null;
        }

        @Override
        public Set<Entry<String, String>> entrySet() {
            return null;
        }

        @Override
        public String putIfAbsent(String key, String value) {
            return null;
        }

        @Override
        public boolean remove(Object key, Object value) {
            return false;
        }

        @Override
        public boolean replace(String key, String oldValue, String newValue) {
            return false;
        }

        @Override
        public String replace(String key, String value) {
            return null;
        }
    };
}
