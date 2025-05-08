# Composite

구조 패턴(Structural Pattern)중 하나로, 부분-전체 구조(part-whole hierarchy)를 표현할 때 사용된다.

개별 객체와 그 객체들의 모음을 동일한 방식으로 다룰 수 있게 해준다.

Component : 공통 인터페이스 또는 추상 클래스. Leaf와 Component가 공통으로 상속 / 구현

Leaf : 더 이상 하위 요소가 없는 개별 객체

Composite : 다른 Component 객체를 자식으로 가질 수 있는 복합 객체

```text
Component
|-- Leaf
|-- Composite
    |-- Leaf
    |-- Composite
        |-- Leaf
        |-- Leaf
```

## 장점

- 트리 구조를 재귀적으로 다루기에 적합하다
- Leaf와 Composite를 동일하게 다루어 client code가 단순해진다.
- 새로운 Leaf나 Composite 타입을 추가하기 쉽다.

## 단점

- Component interface 설계가 어렵다.
- 복잡한 재귀 호출이나 트리 탐색이 많아지면 성능에 영향을 줄 수 있다.

## 사용 사례

### File System

- Component : FileSystemEntity
- Leaf : File
- Composite : Directory

```text
root/
 ├── a.txt
 ├── A/
 │    ├── b.txt
 │    └── c.txt
 └── B/
      └── d.txt
```
